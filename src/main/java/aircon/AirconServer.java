package aircon;

import java.util.logging.Logger;

import aircon.AirconServiceGrpc.AirconServiceImplBase;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//Changed PowerRequest/Response files -> power_ = true

public class AirconServer extends AirconServiceImplBase {
	
	private static final Logger logger = Logger.getLogger(AirconServer.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
		
		AirconServer airconServer = new AirconServer();
		
		int port = 50053;
		
		Server server = ServerBuilder.forPort(port)
				.addService(airconServer)
				.build()
				.start();
		
		logger.info("AirconServer started, listening on " + port);
		
		server.awaitTermination();

	}
	
	public void powerSwitch(PowerRequest request, StreamObserver<PowerResponse> responseObserver) {
		System.out.println("Request received to turn on/off power");
		
		Boolean power = request.getPower();
		
		if(power == true) {
			System.out.println("Power turned on");
		}
		else if (power == false) {
			System.out.println("Power turned off");
		}
		else {
			System.out.println("No option selected");
		}
		
		PowerResponse response = PowerResponse.newBuilder().setPower(power).build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}
	
//	public void getHeating(AdjustTempRequest request, StreamObserver<AdjustTempResponse> responseObserver) {
//		
//		int temp = request.getAdjust();
//		System.out.println("Change temperature to: " + temp + " degrees");
//		System.out.println("Temperature set to: " + temp);
//		responseObserver.onNext(AdjustTempResponse.newBuilder().setAdjust(temp).build());
//		
//		responseObserver.onCompleted();
//		
//	}
	
	public StreamObserver<AdjustTempRequest> getHeating(final StreamObserver<AdjustTempResponse> responseObserver) {
		
		return new StreamObserver<AdjustTempRequest>() {
			
			int heating = 0;

			@Override
			public void onNext(AdjustTempRequest value) {
				
				heating = value.getAdjust();
				System.out.println("Request to change the heating to: " + heating);
				
			}

			@Override
			public void onError(Throwable t) {
				
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				
				AdjustTempResponse response = AdjustTempResponse.newBuilder().setAdjust(heating).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
				
			}	
			
		};
		
	}

}