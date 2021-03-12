package lights;

import java.util.logging.Logger;

import lights.LightServiceGrpc.LightServiceImplBase;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class LightsServer extends LightServiceImplBase {
	
	private static final Logger logger = Logger.getLogger(LightsServer.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
		
		LightsServer lightServer = new LightsServer();
		
		int port = 50052;
		
		Server server = ServerBuilder.forPort(port)
				.addService(lightServer)
				.build()
				.start();
		
		logger.info("LightsServer started, listening on " + port);
		
		server.awaitTermination();

	}
	
	public void powerSwitch(PowerRequest request, StreamObserver<PowerResponse> responseObserver) {
		System.out.println("Request received to turn on/off power");
		
		Boolean power = request.getPower();
		
		if(power) {
			System.out.println("Power turned on");
		}
		else {
			System.out.println("Power turned off");
		}
		
		PowerResponse response = PowerResponse.newBuilder().setPower(power).build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}
	
	public StreamObserver<BrightnessRequest> brightness(final StreamObserver<BrightnessResponse> responseObserver) {
		return new StreamObserver<BrightnessRequest>() {
			
			int brightness = 0;

			@Override
			public void onNext(BrightnessRequest value) {
				
				brightness = value.getLights();
				System.out.println("Brightness turned to level: " + brightness);
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				BrightnessResponse response = BrightnessResponse.newBuilder().setLights(brightness).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
				
			}
			
		};
	}

}