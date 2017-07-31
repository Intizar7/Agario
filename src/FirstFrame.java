import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FirstFrame extends JFrame {

	private FirstPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FirstFrame frame = new FirstFrame();
		//frame.pack();
		frame.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public FirstFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new FirstPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("LYK 2017 JAVA");
	}

}
