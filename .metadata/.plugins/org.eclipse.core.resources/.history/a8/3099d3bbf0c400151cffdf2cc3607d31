import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	protected JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 253, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Calculator myCalculator = new Calculator();
		
		textField = new JTextField();
		textField.setBounds(16, 14, 154, 78);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		btnNewButton.setBounds(16, 172, 61, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("3");
			myCalculator.numberButtonPressed(2);
			}
		});
		
		btnNewButton_1.setBounds(125, 172, 58, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("5");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		btnNewButton_2.setBounds(72, 136, 58, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		btnNewButton_3.setBounds(16, 100, 61, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		btnNewButton_4.setBounds(72, 172, 58, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		btnNewButton_5.setBounds(16, 136, 61, 29);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		btnNewButton_6.setBounds(125, 136, 58, 29);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		btnNewButton_7.setBounds(72, 100, 58, 29);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		btnNewButton_8.setBounds(125, 100, 58, 29);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		btnNewButton_10.setBounds(16, 207, 61, 29);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("=");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_9.setBounds(182, 173, 48, 63);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("+");
				myCalculator.plus();
			}
		});
		btnNewButton_12.setBounds(182, 136, 48, 29);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("-");
				myCalculator.minus();
			}
		});
		btnNewButton_13.setBounds(182, 102, 48, 29);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("x");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("x");
				myCalculator.mult();
				
			}
		});
		btnNewButton_14.setBounds(182, 73, 48, 29);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.setBounds(182, 40, 48, 29);
		contentPane.add(btnNewButton_15);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				myCalculator.clear();
			}
		});
		btnAc.setBounds(182, 14, 48, 29);
		contentPane.add(btnAc);
		
		JButton button = new JButton(".");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(".");
			}
		});
		button.setBounds(125, 207, 58, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("00");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("00");
			}
		});
		button_1.setBounds(69, 207, 61, 29);
		contentPane.add(button_1);
	}
}
