package tcs.ilp;

public class Construcutre {
	int id;
	String name = new String();
	Construcutre(int id,String name){
		this.id=id;
		this.name=name;
	}
	void Printdata(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(name.length());
		System.out.println(name.concat(" shah"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String stringResult = String.format("Integer:%d",59);
		System.out.println(stringResult);
		
	}
	
}
