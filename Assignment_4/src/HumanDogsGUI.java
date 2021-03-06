import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Font;

public class HumanDogsGUI extends JFrame {

	private JPanel contentPane;
	private JTextField dogName;
	private JTextField humanName;
	
	/**Int used to check that the there is more than three letters in the humans name*/
	int nameLength = 3;
	
	Human Human1;
	Dog Dog1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanDogsGUI frame = new HumanDogsGUI();
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
	public HumanDogsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		JTextArea textAreaError1 = new JTextArea();
		textAreaError1.setBounds(54, 360, 477, 53);
		contentPane.add(textAreaError1);
		
		JTextArea textAreaInfo = new JTextArea();
		textAreaInfo.setBounds(54, 265, 466, 55);
		contentPane.add(textAreaInfo);
		textAreaInfo.setEditable(false);
		
		JButton printInfoButton = new JButton("Print info");
		printInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaInfo.setText(Human1.getInfo(Human1.getName()));

			}
		});
		printInfoButton.setBounds(208, 204, 181, 29);
		contentPane.add(printInfoButton);
		
		JButton newHumanButton = new JButton("New human");
		newHumanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**If statement that checks that there is more than three letters in the name*/
				if(humanName.getText().length()<3){
					textAreaError1.setText("Name must have more than three letters");	
				}
				
				Human1 = new Human(humanName.getText());
				
				textAreaInfo.append(Human1.getName());
				
			}
		});
		newHumanButton.setBounds(208, 120, 181, 29);
		contentPane.add(newHumanButton);
		
		JButton buyDogButton = new JButton("Buy dog");
		buyDogButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**If statement that checks that there is an owner before a dog is created*/
				if(humanName.getText().isEmpty()){
					textAreaError1.setText("The dog must have an owner");
				} else {
				Dog1 = new Dog (dogName.getText());
				
				Human1.buyDog(Dog1);
				
				textAreaInfo.setText(Dog1.getName());
				
				dogName.setText("");
				}
			}
		});
		buyDogButton.setBounds(208, 161, 181, 29);
		contentPane.add(buyDogButton);
		
		dogName = new JTextField();
		dogName.setBounds(54, 161, 130, 26);
		contentPane.add(dogName);
		dogName.setColumns(10);
		
		humanName = new JTextField();
		humanName.setBounds(54, 123, 130, 26);
		contentPane.add(humanName);
		humanName.setColumns(10);
		
		
		JLabel lblHumansAndDogs = new JLabel("HUMANS & DOGS");
		lblHumansAndDogs.setFont(new Font("Avenir", Font.PLAIN, 20));
		lblHumansAndDogs.setBounds(195, 45, 194, 29);
		contentPane.add(lblHumansAndDogs);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(52, 233, 61, 16);
		contentPane.add(lblInfo);
		
		JLabel lblErrorMessage = new JLabel("Error message");
		lblErrorMessage.setBounds(52, 332, 94, 16);
		contentPane.add(lblErrorMessage);	
		
		
		
	}
}
