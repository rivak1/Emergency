package tcs.ilp;
import java.util.*;
class Student
{
	int id;
	String name;
	String city;
	double marks;
	
	Student()
	{
		
	}
	Student(int id , String name , String city , double marks)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.marks=marks;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public double getMarks()
	{
		return marks;
	}
	public void setMarks(double marks)
	{
		this.marks=marks;
	}
}

public class Soltuion {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		int size;
		size=sc.nextInt();
		int id;
		double marks;
		String city;
		String name;
		Student s[]= new Student[size];
	 	for(int i=0;i<s.length;i++) {
	 	   	id=sc.nextInt();
	 		name=sc1.nextLine();
	 		city=sc1.nextLine();
	 		marks=sc.nextDouble();
	 		s[i]=new Student(id,name,city,marks);
	 	}
		double marks1;
		String city1;
		marks1=sc.nextDouble();
		city1=sc1.nextLine();
		Student[] s1;
		s1=get(s,city1,marks1);
//		for(int i=0;i<s1.length;i++) {
//			
//			System.out.println(s1[i].getId()+" "+s1[i].getName()+" "+s1[i].getCity()+" "+s1[i].getMarks());
//		}
	}

	public static Student[] get(Student[] students , String city , double marks)
	{
		int l=students.length;
		
		int k=0;
		for(int i=0 ; i<l;i++)
		{
			if(students[i].city.equals(city) && students[i].marks==marks)
			{
				
				k++;
			}
		}
		System.out.println(k);

		Student s[]=new Student[k];
		for(int i=0;i<l;i++)
		{
			//System.out.print("rrrr");
			if(students[i].city.equals(city) && students[i].marks==marks) {
				
				System.out.println(students[i].getId()+" "+students[i].getName()+" "+students[i].getCity()+" "+students[i].getMarks());
			}
		}
		return s;
	}
	}
