
public abstract class Mammal extends Animal{

	private int gestationTime;

	
	/** Constructor to make the animals extended from Mammal */

	public Mammal(String latinName, int gestationTime) {
		super(latinName);
		this.gestationTime = gestationTime;
		
	
	}
	
	/** method used to get the gestation time.  */

	public int getGestationtime(){
		return gestationTime;
	}

	/**Method used to return info about animals*/

	public String getInfo() {
		return null;
	}


	
}



