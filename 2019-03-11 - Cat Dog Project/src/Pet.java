
public class Pet {
	private String name;
	
	public Pet(String name) {
		this.name=name;
	}
	
	public String getName() {return name;}
	public void setName(String n) {name = n;}
	public void run() {System.out.println(name + " is running.");}
	public void speak() {System.out.println("GRRRRRR!");}
	public void act() {
		run();
		speak();
	}
}
