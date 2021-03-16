package aircon;

import java.util.Random;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class AirconClient {
	
	public static AirconServiceGrpc.AirconServiceBlockingStub blockingStub;
	public static AirconServiceGrpc.AirconServiceStub asyncStub;

	public static void main(String[] args) throws Exception {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
		
		blockingStub = AirconServiceGrpc.newBlockingStub(channel);
		asyncStub = AirconServiceGrpc.newStub(channel);
		
		powerSwitch();
		getHeating();

	}
	
	public static void powerSwitch() {
		
		// send the request
		PowerRequest request = PowerRequest.newBuilder().setPower(false).build();
		
		// check the response
		PowerResponse response = blockingStub.powerSwitch(request);
		
		// print appropriate response
		if (response.getPower()) {
			System.out.println("Aircon power has been turned on!");
		}
		else {
			System.out.println("Aircon power has been turned off!");
		}
		
	}
	
	public static void getHeating() {
		
		AdjustTempRequest request = AdjustTempRequest.newBuilder().setAdjust(15).build();
		System.out.println("Changing temperature of medical environment to: " + request + " degrees");
		
		StreamObserver<AdjustTempResponse> responseObserver = new StreamObserver<AdjustTempResponse>() {
			

			@Override
			public void onNext(AdjustTempResponse value) {
				
				System.out.println("The temperature of the room has been changed to: " + value + " degrees");
				
			}

			@Override
			public void onError(Throwable t) {
								
			}

			@Override
			public void onCompleted() {
				
			}
			
		};
			
		StreamObserver<AdjustTempRequest> requestObserver = asyncStub.getHeating(responseObserver);
		
		try {
			
			requestObserver.onNext(AdjustTempRequest.newBuilder().setAdjust(15).build());
			System.out.println("Sent");
			requestObserver.onNext(AdjustTempRequest.newBuilder().setAdjust(16).build());
			System.out.println("Sent");
			requestObserver.onNext(AdjustTempRequest.newBuilder().setAdjust(17).build());
			System.out.println("Sent");
			requestObserver.onNext(AdjustTempRequest.newBuilder().setAdjust(18).build());
			System.out.println("Sent");
			requestObserver.onNext(AdjustTempRequest.newBuilder().setAdjust(19).build());
			System.out.println("Sent");
			
			Thread.sleep(new Random().nextInt(1000) + 500);
			
		} catch (RuntimeException e) {
			
			requestObserver.onError(e);
			throw e;
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
		requestObserver.onCompleted();
		
	}

}