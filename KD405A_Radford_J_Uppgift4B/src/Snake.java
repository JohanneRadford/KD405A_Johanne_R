
public class Snake extends Animal {

	private boolean poisonous;
	private String info;
	
	/** Constructor to make the snakes */

	public Snake(String latinName,  String friendlyName, boolean poisonous) {
		super(latinName);
		this.poisonous = poisonous;
		setFriendlyName(friendlyName);

	}
	
	/** Method to return poisonous */

	public boolean isPoisonous(){
		return poisonous;
	}
	
	
	/** Method to get all the information about the snake */

	@Override
	public String getInfo() {
	if(poisonous){
		info =  " is poisonous " ;
	}else{
		
	info = 	" is not poisonous ";
	
	}
		return "The snake named " + getFriendlyName() + " lat: " + getLatinName()  + info;

	}
	
}

 

