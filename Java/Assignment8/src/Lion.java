
public class Lion extends A {

	public static void check(String className) throws ClassNotFoundException {
		class className1 = class.forName(className);
		String name =className1.class.getSimpleName();
		System.out.println(name);
	}
}
