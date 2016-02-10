
public class Dog extends Mammal{
	
	private boolean stupid;
	
	private String info;
	
	
	/** Constructor that makes dogs without a friendly name */

	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		
	}
	
	/** Constructor used to make the dogs */

	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName){
		super(latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);
		
	}

	/** Method to get all the information about the dog */

	@Override
	public String getInfo() {
		if(stupid){
			info =  " stupid ";
		} else {
			info = " not stupid";
		}
		return "The dog named " + getFriendlyName() + " lat: " + getLatinName() + " nurses for " + getGestationtime() + " months and is" + info;
	}
	
	/** Method that returns stupid */

	public boolean isStupid(){
		return stupid;
	}
	

}

