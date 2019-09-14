public class Dog extends Animal{
	
	public Dog(String name, int legs){
		super(name, legs); 
	}

	@Override 
	public String toString(){
		return(this.name); 
	}



}
