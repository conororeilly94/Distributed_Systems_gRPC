package clientGUI;

import java.awt.Color;
import java.awt.Dimension;
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
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MainGUI implements ActionListener {
	
	private JTextField entry1, reply1;
	
	public static AirconServiceGrpc.AirconServiceBlockingStub blockingStub;
	public static AirconServiceGrpc.AirconServiceStub asyncStub;
	
	
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
	
	public static void main(String [] args) {
		
		MainGUI main = new MainGUI();
		
		main.build();
		
	}
	
	public void build() {
		
//		JFrame frame = new JFrame(); // Creates a frame		
//		
//		frame.setTitle("Smart Medical Environment"); // Sets title of frame
//		frame.setSize(500,500); // Sets x and y dimension of frame
//		frame.setLocationRelativeTo(null); // Sets frame in center
//		frame.setResizable(false); // Prevent frame from being resized
//		frame.setVisible(true); // Makes frame visible
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application
//		
//		frame.getContentPane().setBackground(new Color(0x123456)); // Set background color
//		
//		JPanel panel = new JPanel();
//		panel.add(getService1JPanel());
		
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
	
		panel.add(getAirconService1JPanel());

		frame.setSize(500,500); // Sets x and y dimension of frame
		frame.setLocationRelativeTo(null); // Sets frame in center
		frame.setResizable(false); // Prevent frame from being resized
		frame.getContentPane().setBackground(new Color(0x123456)); // Set background color

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Line 184
		JToggleButton button = (JToggleButton)e.getSource();
		String label = button.getActionCommand();  
		
		if (label.equals("Aircon ON/OFF")) {
			System.out.println("service 1 to be invoked ...");	
			
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			
			blockingStub = AirconServiceGrpc.newBlockingStub(channel);
			asyncStub = AirconServiceGrpc.newStub(channel);
			
			aircon.PowerRequest request = PowerRequest.newBuilder().setPower(false).build();
			
			aircon.PowerResponse response = blockingStub.powerSwitch(request);
			JToggleButton tBtn = (JToggleButton)e.getSource();
			if (tBtn.isSelected()) {
				reply1.setText("Aircon on!" + response);
			}
			else {
				reply1.setText("Aircon off!" + response);
			}			
			
		}
		else {
			
		}		
	}
}
