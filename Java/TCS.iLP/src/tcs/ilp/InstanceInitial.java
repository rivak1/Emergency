package tcs.ilp;
class Bike {
	static{
		System.out.println("Static block");
	}
	{System.out.println("Block call first");}
	Bike(){
		System.out.println("Constructure call");
	}
	
}
public class InstanceInitial {

	public static void main(String[] args) {
		Bike B1= new Bike();
		Bike B2= new Bike();

	}

}
