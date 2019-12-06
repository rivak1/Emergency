package assigment9;
import java.util.Scanner;

public class Screen {
	
	public static void main(String[] args) {
		
		Shape shape = null;
		
		Scanner sc = new Scanner(System.in);
		
		Factory F1 = new Factory();
		shape = F1.createShape("Rectangle");
		shape.getArea();
		Point p = shape.getP1();
		addShape(p,shape);
		
	}

	private static void addShape(Point p, Shape shape) {
		
		
	}

}
