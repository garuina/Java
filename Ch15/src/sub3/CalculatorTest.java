package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorTest() {
		setTitle("나의 계산기 v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setText("0");
		textField_2.setBounds(12, 18, 295, 37);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(0, 10, 323, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(12, 73, 63, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(87, 73, 63, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setBounds(162, 73, 63, 53);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBounds(237, 73, 63, 53);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBounds(12, 135, 63, 53);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBounds(87, 135, 63, 53);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBounds(162, 136, 63, 53);
		contentPane.add(btnNewButton_6);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(237, 136, 63, 53);
		contentPane.add(btnX);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.setBounds(12, 198, 63, 53);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setBounds(12, 265, 63, 53);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("2");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(87, 198, 63, 53);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("1");
		btnNewButton_11.setBounds(87, 265, 63, 53);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("3");
		btnNewButton_12.setBounds(162, 198, 63, 53);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("1");
		btnNewButton_13.setBounds(162, 265, 63, 53);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("-");
		btnNewButton_14.setBounds(237, 199, 63, 53);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.setBounds(237, 265, 63, 53);
		contentPane.add(btnNewButton_15);
	}

}
