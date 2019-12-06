package tcs.ilp;

public class DefaultClassInInterface {
	public static void main(String args[]) {
		String s1="hello my name is rivak";
		String s2="By";
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println("hello".charAt(2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("he"));
		System.out.println(s1.endsWith("i"));
		System.out.println(s1.equals(s1));
		System.out.println(s1.replace("hello", "by"));
		String a[]=s1.split("");
		for( String s:a) {
			System.out.println(s);
		}
		System.out.println(s1.indexOf("hello"));
		System.out.println(s1.substring(1,10));
	}
}

