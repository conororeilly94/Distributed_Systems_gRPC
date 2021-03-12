package lights;

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
	

}
