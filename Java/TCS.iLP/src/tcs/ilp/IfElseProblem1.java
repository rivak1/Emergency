package tcs.ilp;

public class IfElseProblem1 {

	public static void main(String[] args) {
		int Data;
		String name=new String();
		Data=12;
		name="shah";
		System.out.println(name.charAt(2));
		if(Data==12) {
			System.out.println("Data is equal to 12");
		}
		else if(name!="shah") {
			System.out.println("Same name insetion error");
		}
		else {
			System.out.println("All data wrong");
		}
	}

}
