package tcs.ilp;
class Bike1
{
	void show() {
		System.out.println("Hello Rivak");
		}
}
class Show extends Bike1{
	void show() {
		System.out.println("Hello shah");
	}
}
class Details extends Bike1{
	void show() {
		System.out.println("Hello bnaa");
	}
}
public class Polymorfism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bike1 b;
			b=new Show();
			b.show();
			b=new Details();
			b.show();
	}import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Solution {
	    public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	        int n;
	        Scanner sc= new Scanner(System.in);
	            n=sc.nextInt();
	            int a[] = new int[n];
	        for(int i=0;i<a.length;i++){
	            a[i]=sc.nextInt();
	            System.out.println(a[i]);

	        }
	    }
	}



}
