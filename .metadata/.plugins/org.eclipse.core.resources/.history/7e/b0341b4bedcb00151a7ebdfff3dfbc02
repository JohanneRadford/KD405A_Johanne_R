import java.util.ArrayList;
import java.util.Iterator;

public class bikeStore1 {

private static ArrayList<Bike> addBikes = new ArrayList<Bike>();

/**Method that returns all bikes added to the list of Bikes*/

public static String getAllBikes() {
	
String returnString = "";
for (int a = 0; a < addBikes.size(); a ++) {
returnString += ("bike " + (a + 1) + " size " + addBikes.get(a).getPrice() + " og har fargen " + addBikes.get(a).getColor() + " og er pris " + addBikes.get(a).getSize() + "\n"); 
}
 return returnString;
}

/**Method that add bikes to the list*/

public static void addBike(String color, int size, int price) {
addBikes.add(new Bike(color, size, price));
}

}


