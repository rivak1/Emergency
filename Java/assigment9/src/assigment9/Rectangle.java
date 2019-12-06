package assigment9;

public class Rectangle implements Shape {
	
	final private double length;
	final private double breadth;
	final private Point P1;
	
	Rectangle(double length , double breadth , Point P1){
		this.length = length;
		this.breadth = breadth;
		this.P1 = P1;
	}
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}
	public Point getP1() {
		return P1;
	}
	@Override
	public double getArea() {
		System.out.println(this.breadth*this.length);
		return this.breadth * this.length;
	}

	@Override
	public double getPerimeter() {
		System.out.println(this.breadth+this.length);
		return this.breadth + this.length;
	}


	@Override
	public double isPointEnclosed() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getOrigin(Point P, double length, double breadth) {
		// TODO Auto-generated method stub
		return 0;
	}

}
