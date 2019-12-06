package tcs.ilp;
abstract class A{
  abstract	void show();
  abstract void print();
}

class B extends A{
	void show() {
		System.out.println("Hello");
	}
	void print() {
		System.out.println("By");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.show();
		b.print();

	}

}
