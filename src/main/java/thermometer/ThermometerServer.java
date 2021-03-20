package thermometer;

import java.util.logging.Logger;

import thermometer.ThermometerServiceGrpc.ThermometerServiceImplBase;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ThermometerServer extends ThermometerServiceImplBase {
	
	private boolean power = false;
	
	private static final Logger logger = Logger.getLogger(ThermometerServer.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ThermometerServer thermometerServer = new ThermometerServer();
		
		int port = 50051;
		
		Server server = ServerBuilder.forPort(port)
				.addService(thermometerServer)
				.build()
				.start();
		
		logger.info("ThermometerServer started, listening on " + port);
		
		server.awaitTermination();
		
	}
	
	public void powerSwitch(PowerRequest request, StreamObserver<PowerResponse> responseObserver) {	
		
		System.out.println("Request received to turn on/off power");
		
		power = request.getPower();
		
		if(power) {
			
			System.out.println("Thermal Scanner turned on");
			
		}
		
		else {
			
			System.out.println("Thermal Scanner turned off");
			
		}
		
		PowerResponse response = PowerResponse.newBuilder().setPower(power).build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}
	
	public void checkTemp(TempRequest request, StreamObserver<TempResponse> responseObserver) {
		
		System.out.println("Request received to take temperature on thermal scanner");
		
		StringBuilder temperature = new StringBuilder();
		
		temperature.append(request.getTemperature());
		System.out.println("Temperature currently at: " + temperature);
		System.out.println("Temperature displayed: " + temperature);
		
		TempResponse response = TempResponse.newBuilder().setTemperature(15).build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}
}