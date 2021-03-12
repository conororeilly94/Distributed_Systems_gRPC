package aircon;

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
				
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				
				System.out.println("On completed");
				
			}
		};
			
			asyncStub.getHeating(request, responseObserver);
			
			try {
				
				Thread.sleep(30000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
		
	}

}