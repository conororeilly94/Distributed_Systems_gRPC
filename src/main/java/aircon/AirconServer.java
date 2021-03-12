package aircon;

import java.util.logging.Logger;

import aircon.AirconServiceGrpc.AirconServiceImplBase;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import lights.LightsServer;
import thermometer.PowerRequest;
import thermometer.PowerResponse;


public class AirconServer extends AirconServiceImplBase {
	
	private static final Logger logger = Logger.getLogger(LightsServer.class.getName());

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

}
