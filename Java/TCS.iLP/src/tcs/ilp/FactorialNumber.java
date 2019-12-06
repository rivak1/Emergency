package tcs.ilp;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		int Fact;
		int Sum=1;
		Scanner sc = new Scanner(System.in);
		Fact=sc.nextInt();
		for(int i=1;i<=Fact;i++) {
			Sum = Sum*i;
		}
		System.out.println(Sum);

	}

}
