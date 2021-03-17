package clientGUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

import aircon.AdjustTempRequest;
import aircon.AdjustTempResponse;
import aircon.AirconServiceGrpc;
import aircon.PowerRequest;
import aircon.PowerResponse;
import lights.BrightnessRequest;
import lights.BrightnessResponse;
import lights.LightServiceGrpc;
import thermometer.TempResponse;
import thermometer.ThermometerServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lights.LightServiceGrpc;

public class MainGUI implements ActionListener {
	
	private JTextField reply1; // Aircon on/off
	private JTextField reply2; // Lights on/off
	private JTextField reply3; // Thermal scanner on/off
	private JTextField reply4; // Aircon temp
	private JTextField reply5; // Lights brightness
	private JTextField reply6; // Check temp
	
	private JTextField entry1; // Aircon temp
	private JTextField entry2; // Lights Brightness
	
	public static AirconServiceGrpc.AirconServiceBlockingStub blockingStub;
	public static AirconServiceGrpc.AirconServiceStub asyncStub;
	
	private JPanel heading1() {
		
		JPanel panel = new JPanel();

		JLabel heading = new JLabel("Air Conditioning");
		heading.setFont(new Font("Serif", Font.PLAIN, 20));
		panel.add(heading);
		
		return panel;
		
	}
	
	private JPanel getAirconService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Turn Aircon on or off: ");
		panel.add(label);

		JToggleButton button = new JToggleButton("Aircon ON/OFF");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1 .setEditable(false);
		panel.add(reply1);

		panel.setLayout(boxlayout);

		return panel;

	}
	
	private JPanel getAirconService2JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Adjust temperature of room: ");
		panel.add(label);

		entry1 = new JTextField("", 10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JToggleButton button = new JToggleButton("Adjust");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply4 = new JTextField("", 10);
		reply4 .setEditable(false);
		panel.add(reply4);

		panel.setLayout(boxlayout);

		return panel;

	}
	
	private JPanel heading2() {
		
		JPanel panel = new JPanel();

		JLabel heading = new JLabel("Lights");
		heading.setFont(new Font("Serif", Font.PLAIN, 20));
		panel.add(heading);
		
		return panel;
		
	}
	
	private JPanel getLightsService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Turn Lights on or off: ");
		panel.add(label);

		JToggleButton button = new JToggleButton("Lights ON/OFF");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply2 = new JTextField("", 10);
		reply2 .setEditable(false);
		panel.add(reply2);

		panel.setLayout(boxlayout);

		return panel;

	}
	
	private JPanel getLightsService2JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Change brightness of the room: ");
		panel.add(label);

		entry2 = new JTextField("", 10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		JToggleButton button = new JToggleButton("Set");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply5 = new JTextField("", 10);
		reply5 .setEditable(false);
		panel.add(reply5);

		panel.setLayout(boxlayout);

		return panel;

	}
	
	private JPanel heading3() {
		
		JPanel panel = new JPanel();

		JLabel heading = new JLabel("Thermal Scanner");
		heading.setFont(new Font("Serif", Font.PLAIN, 20));
		panel.add(heading);
		
		return panel;
		
	}
	
	private JPanel getThermometerService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Turn Thermal Scanner on or off: ");
		panel.add(label);

		JToggleButton button = new JToggleButton("Thermal Scanner ON/OFF");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply3 = new JTextField("", 10);
		reply3 .setEditable(false);
		panel.add(reply3);

		panel.setLayout(boxlayout);

		return panel;

	}
	
	private JPanel getThermometerService2JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		
		JLabel label = new JLabel("Take temperature: ");
		panel.add(label);

		JToggleButton button = new JToggleButton("Check");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply6 = new JTextField("", 10);
		reply6 .setEditable(false);
		panel.add(reply6);

		panel.setLayout(boxlayout);

		return panel;

	}
	
	public static void main(String [] args) {
		
		MainGUI main = new MainGUI();
		
		main.build();
		
	}
	
	public void build() {
		
		JFrame frame = new JFrame();
		frame.setTitle("Smart Medical Environment"); // Sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

		frame.setSize(500,500); // Sets x and y dimension of frame
		frame.setLocationRelativeTo(null); // Sets frame in center
//		frame.setResizable(false); // Prevent frame from being resized
		frame.getContentPane().setBackground(new Color(0x123456)); // Set background color

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		// ADD SERVICES
		// Heading for Aircon
		panel.add(heading1());
		
		// Aircon Service
		// On/off
		panel.add(getAirconService1JPanel());
		// Increase/decrease temp
		panel.add(getAirconService2JPanel());
		
		// Heading for Lights
		panel.add(heading2());
		// Light Service
		// On/off
		panel.add(getLightsService1JPanel());
		
		// Set brightness
		panel.add(getLightsService2JPanel());
		
		// Heading for Thermometer
		panel.add(heading3());
		// Thermometer Service
		// On/off
		panel.add(getThermometerService1JPanel());
		
		// Get temp
		panel.add(getThermometerService2JPanel());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Line 184
		JToggleButton tBtn = (JToggleButton)e.getSource();
		String label = tBtn.getActionCommand();  
		
		// TURN AIRCON ON OR OFF!!!
		if (label.equals("Aircon ON/OFF")) {
			System.out.println("Aircon on/off service to be invoked");	
			
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			
			AirconServiceGrpc.AirconServiceBlockingStub blockingStub = AirconServiceGrpc.newBlockingStub(channel);
			AirconServiceGrpc.AirconServiceStub asyncStub = AirconServiceGrpc.newStub(channel);
			
			aircon.PowerRequest request = aircon.PowerRequest.newBuilder().setPower(false).build();
			
			aircon.PowerResponse response = blockingStub.powerSwitch(request);
			if (tBtn.isSelected()) {
				reply1.setText("Aircon On!");
			}
			else {
				reply1.setText("Aircon Off!");
			}			
		}
		
		// TURN LIGHTS ON OR OFF!!!
		if (label.equals("Lights ON/OFF")) {
			System.out.println("Lights on/off service to be invoked");
			
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			
			LightServiceGrpc.LightServiceBlockingStub blockingStub = LightServiceGrpc.newBlockingStub(channel);
			LightServiceGrpc.LightServiceStub asyncStub = LightServiceGrpc.newStub(channel);
			
			lights.PowerRequest request = lights.PowerRequest.newBuilder().setPower(false).build();
			
			lights.PowerResponse response = blockingStub.powerSwitch(request);
			if (tBtn.isSelected()) {
				reply2.setText("Lights On!");
			}
			else {
				reply2.setText("Lights Off!");
			}
		}
		
		// TURN THERMAL SCANNER ON OR OFF!!!
		if (label.equals("Thermal Scanner ON/OFF")) {
			System.out.println("Thermal Scanner on/off service to be invoked");
			
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			
			ThermometerServiceGrpc.ThermometerServiceBlockingStub blockingStub = ThermometerServiceGrpc.newBlockingStub(channel);
			ThermometerServiceGrpc.ThermometerServiceStub asyncStub = ThermometerServiceGrpc.newStub(channel);
			
			thermometer.PowerRequest request = thermometer.PowerRequest.newBuilder().setPower(false).build();
			thermometer.PowerResponse response = blockingStub.powerSwitch(request);
			if (tBtn.isSelected()) {
				reply3.setText("Thermal Scanner On!");
			}
			else {
				reply3.setText("Thermal Scanner Off!");
			}
		}
		
		// ADJUST TEMPERATURE OF AIR CON
		if (label.equals("Adjust")) {
			System.out.println("Air conditioning adjust temp service to be invoked");
			
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			
			AirconServiceGrpc.AirconServiceBlockingStub blockingStub = AirconServiceGrpc.newBlockingStub(channel);
			AirconServiceGrpc.AirconServiceStub asyncStub = AirconServiceGrpc.newStub(channel);
			
			aircon.AdjustTempRequest request = aircon.AdjustTempRequest.newBuilder().setAdjust(Integer.parseInt(entry1.getText())).build();
			
//			AdjustTempRequest request = AdjustTempRequest.newBuilder().setAdjust(Integer.parseInt(entry1.getText())).build();
			
			reply4.setText(request + " degrees");
			
			StreamObserver<AdjustTempResponse> responseObserver = new StreamObserver<AdjustTempResponse>() {				

				@Override
				public void onNext(AdjustTempResponse value) {
					
					System.out.println("The temperature of the room has been changed to: " + value + " degrees");
					
				}

				@Override
				public void onError(Throwable t) {
									
				}

				@Override
				public void onCompleted() {
					
				}
				
			};
				
			StreamObserver<AdjustTempRequest> requestObserver = asyncStub.getHeating(responseObserver);
			
			try {
				
				requestObserver.onNext(AdjustTempRequest.newBuilder().setAdjust(Integer.parseInt(entry1.getText())).build());
				System.out.println("Sent");
				
				Thread.sleep(new Random().nextInt(1000) + 500);
				
			} catch (RuntimeException f) {
				
//				requestObserver.onError(f);
//				throw f;
				
			} catch (InterruptedException f) {
				
//				f.printStackTrace();
				
			}
			
//			requestObserver.onCompleted();
			
			
		}
		
		if (label.equals("Set")) {
			System.out.println("Lights brightness service to be invoked");
			
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
			
			LightServiceGrpc.LightServiceBlockingStub blockingStub = LightServiceGrpc.newBlockingStub(channel);
			LightServiceGrpc.LightServiceStub asyncStub = LightServiceGrpc.newStub(channel);
			
			lights.BrightnessRequest request = lights.BrightnessRequest.newBuilder().setLights(Integer.parseInt(entry2.getText())).build();
			
			reply5.setText("Brightness: " + request);
			
			StreamObserver<BrightnessResponse> responseObserver = new StreamObserver<BrightnessResponse>() {

				@Override
				public void onNext(BrightnessResponse value) {
					
					System.out.println("Brightness has been set to level" + request);
					
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
				
				Thread.sleep(new Random().nextInt(1000) + 500);
				
			} catch (RuntimeException g) {
				requestObserver.onError(g);
				throw g;
				
			} catch (InterruptedException g) {
				
				g.printStackTrace();
				
			}
			
				requestObserver.onCompleted();	
			
		}
		
		if (label.equals("Check")) {
			System.out.println("Thermal Scanner temp check service to be invoked");
			
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			
			ThermometerServiceGrpc.ThermometerServiceBlockingStub blockingStub = ThermometerServiceGrpc.newBlockingStub(channel);
			ThermometerServiceGrpc.ThermometerServiceStub asyncStub = ThermometerServiceGrpc.newStub(channel);
			
			thermometer.TempRequest request = thermometer.TempRequest.newBuilder().setTemperature("15").build();
			
//			thermometer.TempResponse response = blockingStub.checkTemp(Integer.parseInt(request));
			
			reply6.setText("Reads: " + request);
			
			StreamObserver<TempResponse> responseObserver = new StreamObserver<TempResponse>() {

				@Override
				public void onNext(TempResponse value) {
					
					System.out.println("Thermal Scanner reads: " + value.getTemperature());
					
				}

				@Override
				public void onError(Throwable t) {
					
				}

				@Override
				public void onCompleted() {
					
				}
				
			};
			
			asyncStub.checkTemp(request, responseObserver);
			
			try {
				
				Thread.sleep(300000);		
				
			} catch (InterruptedException l) {
				
				l.printStackTrace();
				
			}
			
		}
		
	}
}
