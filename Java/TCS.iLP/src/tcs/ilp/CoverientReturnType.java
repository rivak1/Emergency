package tcs.ilp;

class a{
	int get() {
		return 1;
	}
	void show() {
		System.out.println("hello");
	}
}
class B extends a{
	int get() {
		System.out.println("Hello java");
		super.show();
		return 1;
	}
}

public class CoverientReturnType {
	public static void main(String args[]) {
	B A= new B();
	A.get();
	}	
}
