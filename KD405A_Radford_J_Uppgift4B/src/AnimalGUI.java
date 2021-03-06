import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class AnimalGUI extends JFrame {
	
	private ArrayList<Animal> myAnimals = new ArrayList<Animal>();


	private JPanel contentPane;

	/**
	 *

	 * Launch the application.
	
	*/
	 
		 
	public static void main(String[] args) {
	
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
					
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
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea textAreaAnimallist = new JTextArea();
		textAreaAnimallist.setEditable(false);
		textAreaAnimallist.setBounds(50, 74, 571, 125);
		contentPane.add(textAreaAnimallist);
		 /** Array list of animals*/
		Animal Animal0 = new Snake("Python regius", "Karo ", true);
		myAnimals.add(Animal0);
		Animal Animal1 = new Dog("Canis latrans", 3, true, "Maja");
		myAnimals.add(Animal1);
		Animal Animal2 = new Snake("Python regius", "Nagini", false);
		myAnimals.add(Animal2);
		Animal Animal3 = new Cat("Lynx, Lynx", 5, 9, "Milly");
		myAnimals.add(Animal3);
		Animal Animal4 = new Dog("Canis latrans", 6, false, "Lassi");
		myAnimals.add(Animal4);
		
		/** for loop that runs through the arraylist and prints out all the information about the animals in the text are*/
		 for(Animal animal : myAnimals){
			 textAreaAnimallist.append(animal.getInfo() + "\n");
		 }
	}

}
