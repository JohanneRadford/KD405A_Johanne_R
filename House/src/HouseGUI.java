import java.awt.BorderLayout;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	
	private House[] myHouses;
	
	private ArrayList<House> houseList = new ArrayList<House>();
	//ArrayList houseList = new ArrayLis();
	
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 6, 624, 383);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(10);
		scrollPane.setViewportView(textArea);
		
		
		
		
// 1.2
		
textArea.append("Uppgift 1.2" + "\n");	

		
		House myHouse1 = new House(1900, 100);
		House myHouse2 = new House(1910, 110);
		House myHouse3 = new House(1920, 120);
		
		
	

System.out.println("House 1 is built in " + myHouse1.getYearBuilt() + " and " + myHouse1.getSize() + " kvm large");		
System.out.println("House 2 is built in " + myHouse2.getYearBuilt()+ " and " + myHouse2.getSize() + " kvm large");		
System.out.println("House 3 is built in " + myHouse3.getYearBuilt()+ " and " + myHouse3.getSize()  + " kvm large");
textArea.append("House 1 is built in " + myHouse1.getYearBuilt() + " and " + myHouse1.getSize() + " kvm large" + "\n");
textArea.append("House 2 is built in " + myHouse2.getYearBuilt()+ " and " + myHouse2.getSize() + " kvm large" + "\n");
textArea.append("House 3 is built in " + myHouse3.getYearBuilt()+ " and " + myHouse3.getSize()  + " kvm large" + "\n");


// 1.3
textArea.append("Uppgift 1.3" + "\n");


myHouses = new House[10];

myHouses[0] = new House(1900,100);
myHouses[1] = new House(1910,110);
myHouses[2] = new House(1920,120);	
myHouses[3] = new House(1930,130);
myHouses[4] = new House(1940,140);
myHouses[5] = new House(1950,150);
myHouses[6] = new House(1960,160);
myHouses[7] = new House(1970,170);
myHouses[8] = new House(1980,180);
myHouses[9] = new House(1990,190);

for(int i = 0; i < 10; i++){
	System.out.println(myHouses[i].getSize() +  " " + myHouses[i].getYearBuilt() + " ");
	textArea.append("House is " + myHouses[i].getSize() +  " kvm large, and built in year " + myHouses[i].getYearBuilt() + ". " + "\n");

}

//1.4
 
	
textArea.append("Uppgift 1.4" + "\n");

Random rand = new Random ();

for(int i =0; i<100; i++){
	int size = rand.nextInt(990) + 10;
	int yearBuilt = rand.nextInt(215) + 1800;

	houseList.add(new House(yearBuilt,size));
	}

for(House hus: houseList){
	System.out.println("huset er " + hus.getSize() +  " kvm stort, og bygget i år " + hus.getYearBuilt());
  textArea.append("huset er " + hus.getSize() +  " kvm stort, og bygget i år " + hus.getYearBuilt() + "\n");
	
	
}


	
}
	
	
	

	
}


