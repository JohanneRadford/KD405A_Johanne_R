
public class Human {
	
	
	private Dog dog;
	private String name;
	private String info;

	/**Constructor that makes the human*/
	public Human(String name) {
		this.name = name;
		
	
	}
	
	/**Method used to get the name of the human*/
	public String getName(){
		return name;
	}
	
	/**Method used to buy the dog*/
	public Dog buyDog(Dog dog1){
		this.dog = dog1;
		return dog;
			
	}
	
	/**Method used to return information about the human*/
	public String getInfo(String info){
		if(dog == null){
			info = getName() + " has no dog ";
		} else {
			info = getName() + " is buying a dog named " + dog.getName();
		}
		return info;
	
	}

}
