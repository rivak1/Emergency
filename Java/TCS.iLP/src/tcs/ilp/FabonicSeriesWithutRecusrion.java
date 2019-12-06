package tcs.ilp;
import java.util.Scanner;

public class FabonicSeriesWithutRecusrion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Length;
		System.out.println("Enter the Lenght of Faboni series");
		Length=sc.nextInt();
		int a,b,c;
		a=0;
		b=1;
		System.out.println(a+" "+b);
		while(Length>b) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(b);
		}
		
	}

}
