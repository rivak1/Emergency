package tcs.ilp;

public class NestedIfElse {

	public static void main(String[] args) {
		int Age=19;
		double Hglobin=12.5;
		
		if(Age>18) {
			System.out.println("Your age is perfact");
			
			if(Hglobin<=12.5) {
				System.out.println("Your HGlobin is not perfect");
				
			}
			else {
				System.out.println("Your Hglobin is perfect");
			}
		}
		
		else {
			System.out.println("Your age is not perfect");
		}
		

	}

}
