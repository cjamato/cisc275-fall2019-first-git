public class Animal{
	protected int legs;
	protected String name; 
	public Animal(String name, int legs){
		this.legs = legs; 
		this.name = name;
	}

	public int getLegs(){return this.legs;}
	public String getName(){return this.name;}

	public void setLegs(int legs){this.legs = legs;}
	public void setName(String name){this.name = name;}

}
