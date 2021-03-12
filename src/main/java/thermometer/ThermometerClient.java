package thermometer;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ThermometerClient {
	
	public static ThermometerServiceGrpc.ThermometerServiceBlockingStub blockingStub;
	public static ThermometerServiceGrpc.ThermometerServiceStub asyncStub;

	public static void main(String[] args) throws Exception {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		
		blockingStub = ThermometerServiceGrpc.newBlockingStub(channel);
		asyncStub = ThermometerServiceGrpc.newStub(channel);
		
		powerSwitch();

	}

	public static void powerSwitch() {
		
		// send the request
		PowerRequest request = PowerRequest.newBuilder().setPower(false).build();
		
		// check the response
		PowerResponse response = blockingStub.powerSwitch(request);
		
		// print appropriate message depending on response
		if (response.getPower()) {
			System.out.println("Thermometer power has been turned on!");
		}
		else {
			System.out.println("Thermometer power has been turned off!");
		}

    }
	
}
