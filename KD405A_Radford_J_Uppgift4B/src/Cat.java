
public class Cat extends Mammal{

	private int numberOfLifes;	
	
	
	/** Constructor used to make the cats */

	public Cat(String latinName, int gestationTime, int numberOfLifes, String friendlyName) {
		super(latinName, gestationTime);
		this.numberOfLifes = numberOfLifes;
		setFriendlyName(friendlyName);
	}
	
	/** Method used to get how many lives the cat has*/

	public int getNumberOfLifes(){
		return numberOfLifes;
	}
	

	/** Method used to set how many lives the cat has*/

	public void setNumberOfLifes(int i){
		this.numberOfLifes = i;
		
	}
	
	
	/** Method to get all the information about the cat */

	@Override
	public String getInfo() {
		
		return "This is a cat with name " + getFriendlyName() + " lat: " + getLatinName() +  " nurses for " + getGestationtime() + " months and has " + getNumberOfLifes() + " lives";
	}



}

