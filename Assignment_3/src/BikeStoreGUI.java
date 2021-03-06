import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textPrice;
	private JTextField textColor;
	private JTextField textSize;
	private JTextField txtPrice;
	private JTextField txtColor;
	private JTextField txtSize;
	private JScrollPane scrollPane;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bikeStore1 myBikeStore = new bikeStore1();
		
		textPrice = new JTextField();
		textPrice.setBounds(92, 99, 130, 26);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		textColor = new JTextField();
		textColor.setBounds(92, 137, 130, 26);
		contentPane.add(textColor);
		textColor.setColumns(10);
		
		textSize = new JTextField();
		textSize.setBounds(92, 175, 130, 26);
		contentPane.add(textSize);
		textSize.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 17, 391, 71);
		contentPane.add(scrollPane);
		
		JTextArea BikeListtextArea = new JTextArea();
		scrollPane.setViewportView(BikeListtextArea);
		
		JButton btnNewButton = new JButton("Add bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bikeStore1.addBike(textColor.getText(),Integer.parseInt(textSize.getText()), Integer.parseInt(textPrice.getText()));
				BikeListtextArea.setText(bikeStore1.getAllBikes());
				textColor.setText("");
				textPrice.setText("");
				textSize.setText("");
			}
		});
		
		
		btnNewButton.setBounds(255, 99, 117, 98);
		contentPane.add(btnNewButton);
		
		
		txtPrice = new JTextField();
		txtPrice.setText("Price");
		txtPrice.setBounds(27, 99, 53, 26);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtColor = new JTextField();
		txtColor.setText("Color");
		txtColor.setBounds(27, 137, 53, 26);
		contentPane.add(txtColor);
		txtColor.setColumns(10);
		
		txtSize = new JTextField();
		txtSize.setText("Size");
		txtSize.setColumns(10);
		txtSize.setBounds(27, 175, 53, 26);
		contentPane.add(txtSize);
		
	}
}
