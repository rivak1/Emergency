package tcs.ilp;
interface  A1{
	void show();
	void print();
}
class B1 implements A1{
	
	public  void show() {
		System.out.print("Helo");
	}
	public void print() {
		System.out.print("by");
	}
}


public class InterFaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = new B1();
		b.show();
		b.print();
	
	}

}
