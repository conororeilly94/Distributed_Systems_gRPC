package jmdns;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class SmartMedicalServiceRegistration {
	
	public static void main(String[] args) throws InterruptedException {

        try {
        	
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo thermometer = ServiceInfo.create("_http._tcp.local.", "thermometer", 50051, "Control the thermal scanner");
            jmdns.registerService(thermometer);
            
            ServiceInfo light = ServiceInfo.create("_http._tcp.local.", "light", 50052, "Control the lights");
            jmdns.registerService(light);
            
            ServiceInfo aircon = ServiceInfo.create("_http._tcp.local.", "aircon", 50053, "Control the aircon");
            jmdns.registerService(aircon);
            
            // Wait a bit
            Thread.sleep(25000);

            jmdns.unregisterAllServices();
            

        } catch (IOException e) {
        	
            System.out.println(e.getMessage());
            
        }
        
    }

}
