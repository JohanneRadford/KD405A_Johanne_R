
public class Bike {
private String color;
private int price;
private int size;



/**Generate bikes with variables limited by values in Constans.java*/
public Bike(String color, int size, int price){
	
	
	if (size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE){
		this.size = size;
	}else{
		
	this.size = 0;
	}
	
	if (price >= Constants.MIN_PRICE && price <= Constants.MAX_PRICE){
		this.price = price;
	}else{
		
	this.price = 0;
	
	}
	
	for(int i = 0; i<Constants.bikeColors.length; i++){
		 if(0 == color.compareTo(Constants.bikeColors[i].toString())){
			this.color = color;
			break;
		 }else{
			 this.color = "feil farge";
		 }
	}
	
}


/**Generate bikes with variables limited by values in Constans.java*/
public Bike(String color, int size){
	this.color = color;
	this.size = size;	
	
}


/**Method used in Main.java to return Color*/
public String getColor() {
	return this.color;
}

/**Method used in Main.java to return size*/
public int getSize() {
	return this.size;
}

/**Method used in Main.java to return price*/
public int getPrice() {
	return this.price;
}


}

