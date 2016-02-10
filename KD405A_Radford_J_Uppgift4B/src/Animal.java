public abstract class Animal {
	private String latinName;
	public String getLatinName() {
		return latinName;
	}

	
	/** Constructor used to make all animals*/

	public Animal(String latinName) {
this.latinName = latinName;
}

	/** method used to get all the information about the animals */
	
	public abstract String getInfo();
	
	
	/** method used to set the friendly name of the animal */
	
	public void setFriendlyName(String friendlyName){
		this.friendlyName = friendlyName;
	}
	
	/** method used to get the friendly name of the animal */

	public String getFriendlyName(){
		return friendlyName;
	}



/** method used to set the latin name of the animal */

public void setLatinName(String latinName) {
	this.latinName = latinName;
}

private String friendlyName;

}