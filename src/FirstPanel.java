import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import tr.org.linux.kamp.game.logic.GameLogic;
import tr.org.linux.kamp.game.model.Difficulty;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SpringLayout;

public class FirstPanel extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private ButtonGroup buttonGroup;

	/**
	 * Create the panel.
	 */
	public FirstPanel() {
		setBackground(Color.LIGHT_GRAY);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblUserName = new JLabel("User Name:");
		springLayout.putConstraint(SpringLayout.NORTH, lblUserName, 39, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblUserName, 6, SpringLayout.WEST, this);
		add(lblUserName);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 37, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textField, 102, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, textField, 428, SpringLayout.WEST, this);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		springLayout.putConstraint(SpringLayout.NORTH, lblPassword, 64, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblPassword, 21, SpringLayout.WEST, this);
		add(lblPassword);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 62, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 102, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, passwordField, 428, SpringLayout.WEST, this);
		add(passwordField);
		
		JLabel lblSelectColor = new JLabel("Select Color:");
		springLayout.putConstraint(SpringLayout.NORTH, lblSelectColor, 123, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblSelectColor, 6, SpringLayout.WEST, this);
		add(lblSelectColor);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 118, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 102, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 428, SpringLayout.WEST, this);
		add(comboBox);
		comboBox.addItem("RED");
		comboBox.addItem("BLUE");
		comboBox.addItem("PINK");
		comboBox.addItem("GREEN");
		comboBox.addItem("YELLOW");
		
		JLabel lblDifficulty = new JLabel("Difficulty:");
		springLayout.putConstraint(SpringLayout.NORTH, lblDifficulty, 183, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblDifficulty, 6, SpringLayout.WEST, this);
		add(lblDifficulty);
		
		JRadioButton rdbtnEasy = new JRadioButton("Easy");
		rdbtnEasy.setSelected(true);
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnEasy, 179, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnEasy, 102, SpringLayout.WEST, this);
		add(rdbtnEasy);
		
		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnNormal, 212, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnNormal, 102, SpringLayout.WEST, this);
		add(rdbtnNormal);
		
		JRadioButton rdbtnHard = new JRadioButton("Hard");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnHard, 246, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnHard, 102, SpringLayout.WEST, this);
		add(rdbtnHard);
		buttonGroup=new ButtonGroup();
		buttonGroup.add(rdbtnEasy);
		buttonGroup.add(rdbtnNormal);
		buttonGroup.add(rdbtnHard);
		
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Color selecetedColor=Color.BLACK;
				switch (comboBox.getSelectedItem().toString()) {
				case "RED":
					selecetedColor=Color.RED;
					break;
				case "BLUE":
				    selecetedColor=Color.BLUE;
				    break;
				case "PINK":
				    selecetedColor=Color.PINK;
				    break;
				case "GREEN":
				    selecetedColor=Color.GREEN;
				    break;
				case "YELLOW":
				    selecetedColor=Color.YELLOW;
				    break;
				default:
					break;
				}
				
				Difficulty difficulty=Difficulty.EISY;
				
				if(rdbtnEasy.isSelected()) {
					//easy
					difficulty=Difficulty.EISY;
				}else if(rdbtnNormal.isSelected()) {
					//normal
					difficulty=Difficulty.NORMAL;
				}else if(rdbtnHard.isSelected()) {
					//hard
					difficulty=Difficulty.HARD;
				}
				GameLogic gameLogic=new GameLogic(textField.getText(),selecetedColor,difficulty);
				gameLogic.startApplication();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnStart, 245, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnStart, 327, SpringLayout.WEST, this);
		add(btnStart);
	
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(FirstPanel.this,"Bu yazılım GPL altındadır,\n Ozgur bir ortamda \n Ozgur yazılım kullanılarak"
						+ "Ozgur bireyler tarafından geliştirilmiitir"+
						"Java 2017 Linux Yaz Kampi","About", JOptionPane.DEFAULT_OPTION);
			}
		});
		
		springLayout.putConstraint(SpringLayout.NORTH, btnAbout, 245, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnAbout, 434, SpringLayout.WEST, this);
		add(btnAbout);
		
	}

}
