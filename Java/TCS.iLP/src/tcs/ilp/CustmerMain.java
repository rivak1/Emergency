package tcs.ilp;
public class CustmerMain {
 	public static double get(Customer [] c1) {
 		double sum=0.0;
		for(int i=0;i<c1.length-1;i++) {
			double a;
			a=Math.sqrt(Math.pow((c1[i+1].a-c1[i].a),2)+Math.pow((c1[i+1].b-c1[i].b),2));
			sum=sum+a;
			
		}
		return sum;
	}

public static void main(String[] args) {
		Customer [] c1 = new Customer[4];
		c1[0] = new Customer(-3,-4);
		c1[1] = new Customer(0,0);
		c1[2] = new Customer(4,3);
		c1[3] = new Customer(16,-2);
		double a=get(c1);
		System.out.println(a);
		
	}

}
