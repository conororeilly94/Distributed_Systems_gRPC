package lights;

import java.util.logging.Logger;

import lights.LightServiceGrpc.LightServiceImplBase;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class LightsServer extends LightServiceImplBase {
	
	private boolean power = false;
	
	private int brightness = 0;
	
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
		
		power = !power;
		
		if(power) {
			System.out.println("Lights turned on");
		}
		else {
			System.out.println("Lights turned off");
		}
		
		PowerResponse response = PowerResponse.newBuilder().setPower(power).build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}
	
	public StreamObserver<BrightnessRequest> brightness(final StreamObserver<BrightnessResponse> responseObserver) {
		System.out.println("Request received to adjust brightness of lights");
		
		return new StreamObserver<BrightnessRequest>() {		

			@Override
			public void onNext(BrightnessRequest value) {
				
				brightness = value.getLights();
				
				BrightnessResponse reply = BrightnessResponse.newBuilder().setLights(brightness).build();
				
				responseObserver.onNext(reply);
				System.out.println("Brightness level changed");
				
			}

			@Override
			public void onError(Throwable t) {
				
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				
				responseObserver.onCompleted();
				
			}
			
		};
	}

}