package lights;

import java.util.Random;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class LightsClient {
	
	public static LightServiceGrpc.LightServiceBlockingStub blockingStub;
	public static LightServiceGrpc.LightServiceStub asyncStub;

	public static void main(String[] args) throws Exception {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
		
		blockingStub = LightServiceGrpc.newBlockingStub(channel);
		asyncStub = LightServiceGrpc.newStub(channel);
		
		powerSwitch();
		brightness();

	}
	
	public static void powerSwitch() {
		
		// send the request
		PowerRequest request = PowerRequest.newBuilder().setPower(false).build();
		
		// check the response
		PowerResponse response = blockingStub.powerSwitch(request);
		
		// print appropriate response
		if(response.getPower()) {
			System.out.println("Lights has been turned on!");
		}
		else {
			System.out.println("Lights has been turned off!");
		}
		
	}
	
	public static void brightness() {
		
		StreamObserver<BrightnessResponse> responseObserver = new StreamObserver<BrightnessResponse>() {

			@Override
			public void onNext(BrightnessResponse value) {
				
				System.out.println("Brightness has been set to level");
				
			}

			@Override
			public void onError(Throwable t) {
				
				
			}

			@Override
			public void onCompleted() {
				
			}
			
		};
			
		StreamObserver<BrightnessRequest> requestObserver = asyncStub.brightness(responseObserver);
		try {
			
			requestObserver.onNext(BrightnessRequest.newBuilder().setLights(1).build());
			System.out.println("Request Sent");
			requestObserver.onNext(BrightnessRequest.newBuilder().setLights(2).build());
			System.out.println("Request Sent");
			requestObserver.onNext(BrightnessRequest.newBuilder().setLights(3).build());
			System.out.println("Request Sent");
			requestObserver.onNext(BrightnessRequest.newBuilder().setLights(4).build());
			System.out.println("Request Sent");
			requestObserver.onNext(BrightnessRequest.newBuilder().setLights(5).build());
			System.out.println("Request Sent");
			
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
