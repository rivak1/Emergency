package tcs.ilp;
import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		int Data;
		/** here i like to say*/
		System.out.println("Insert the Data");
		Scanner sc= new Scanner(System.in);
		Data=sc.nextInt();
		switch(Data) {
		
		case 1: 
			System.out.println("Data is"+Data);
			break;
		
		case 2:
			System.out.println("Data is"+Data);
			break;
		default:
			System.out.println("Data is not matched"+Data);
	}
}

}
