import java.util.ArrayList;


public class Main {

	public static ArrayList<Bike> allBikes = new ArrayList<Bike>();

	//public static Bike[] myBikes;
	

	public static void main(String[] args) {
	
		
		Bike Bike0 = new Bike("green", 10, 20);
		allBikes.add(Bike0);
		Bike Bike1 = new Bike("red", 20, 10);
		allBikes.add(Bike1);
		Bike Bike2 = new Bike("blue", 10, 20);
		allBikes.add(Bike2);
		Bike Bike3 = new Bike("yellow", 20, 10);
		allBikes.add(Bike3);
		Bike Bike4 = new Bike("silver", 10, 20);
		allBikes.add(Bike4);
		Bike Bike5 = new Bike("gold", 40, 10);
		allBikes.add(Bike5);
		Bike Bike6 = new Bike("purple", 10, 40000);
		allBikes.add(Bike6);
		Bike Bike7 = new Bike("white", 20, 10);
		allBikes.add(Bike7);
		Bike Bike8 = new Bike("pink", 10, 20);
		allBikes.add(Bike8);
		Bike Bike9 = new Bike("black", 20, 10);
		allBikes.add(Bike9);
		
		 int i = 1;
			 for(Bike bikes : allBikes){
				System.out.println("sykkel " +(i++)+ " "+ bikes.getSize() +  " " + bikes.getPrice() + " " + bikes.getColor() + "\n");
				System.out.println("sykkel " +(i++)+ " "+ bikes.getSize() +  " " + bikes.getPrice() + " " + bikes.getColor() + "\n");

				
				if( bikes.getPrice() < Constants.getMinPrice() || bikes.getPrice() > Constants.getMaxPrice()){
					System.out.println( bikes.getPrice() + " er feil pris, pris må være mellom " + Constants.getMinPrice() + " og " + Constants.getMaxPrice()+ "\n");
						
						}
				if(bikes.getSize() < Constants.getMinSize() || bikes.getSize() > Constants.getMaxSize()){
					System.out.println(bikes.getSize() + " er feil størrelse, størrelsen må være mellom " + Constants.getMinSize() + " og " + Constants.getMaxSize()+ "\n");
						}
				
			 }
			 
		}
				
	 }
		 
		 

	
	



	
	




