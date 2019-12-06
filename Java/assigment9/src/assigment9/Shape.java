package assigment9;

public interface Shape {
	
	  enum ShapeType 
	    { 
	        Circle , Rectangle , Square; 
	    } 
	
	double getArea();
	double getPerimeter();
	double getOrigin(Point P,double length , double breadth);
	double isPointEnclosed();
	Point getP1();
	
}

