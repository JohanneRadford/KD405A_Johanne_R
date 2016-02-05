
public class Constants {

	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 30000;
	

	public static final String[] bikeColors = new String []{"green", "red", "blue", "yellow", "silver", "gold", "purple", "white", "pink"};
 
	/**Method used in Main.java to check if color is approved or not*/


 
 /**Method used in Main.java to set the minimum size*/
 public static int getMinSize(){
	 return MIN_SIZE;
 }
 
 /**Method used in Main.java set the maximum size*/
 public static int getMaxSize(){
	 return MAX_SIZE;
 }
 
 /**Method used in Main.java to set the minimum price*/
 public static int getMinPrice(){
	 return MIN_PRICE;
 }
 
 /**Method used in Main.java to set the maximum price*/
 public static int getMaxPrice(){
	 return MAX_PRICE;
 }
 
 
	public Constants() {

	}
	
	public static void main(String[] args) {
		
	for(int i = 0; i < 9; i++){

			System.out.println(bikeColors[i]);
			
			
			
			}
	
		}
	
 
		
	}



