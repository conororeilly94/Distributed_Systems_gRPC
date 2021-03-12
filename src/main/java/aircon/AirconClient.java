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

}
