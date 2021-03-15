package clientGUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

import aircon.AirconServiceGrpc;
import aircon.PowerRequest;
import aircon.PowerResponse;
import lights.LightServiceGrpc;
import thermometer.ThermometerServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lights.LightServiceGrpc;

public class MainGUI implements ActionListener {
	
	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	private JTextField entry3, reply3;
	
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
		
		// Heading for Lights
		panel.add(heading2());
		// Light Service
		// On/off
		panel.add(getLightsService1JPanel());
		
		// Set brightness
		
		// Heading for Thermometer
		panel.add(heading3());
		// Thermometer Service
		// On/off
		panel.add(getThermometerService1JPanel());
		
		// Get temp
		
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
	}
}
