package assigment9;

import java.util.Scanner;

public class Factory{

	Shape createShape(String shapeType){
	
		if(shapeType == null) {
			return null;
		}
		switch(shapeType){
			
			case "Rectangle":
			{
				System.out.println("Enter your length");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your breadth");
				double length = sc.nextDouble();
				double breadth = sc.nextDouble();
				return new Rectangle(length, breadth , new Point(2,3));
			}
			case "Square":
			{
				System.out.println("Enter your length");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your breadth");
				double length = sc.nextDouble();
				double breadth = sc.nextDouble();
				return new Rectangle(length, breadth , new Point(2,3));
			}
			
			case "Triangle":{
				System.out.println("Enter your length");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your breadth");
				double length = sc.nextDouble();
				double breadth = sc.nextDouble();
				return new Rectangle(length, breadth , new Point(2,3));	
			}
		}
		
		return null;
	}
	
}
