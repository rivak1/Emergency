package com.metacube.get2019;

import com.metacube.get2019.Shape.ShapeType;

public class Triangle implements Shape {
	
	private int side1, side2, side3;
	private Point origin;
	private int shapeId;

	private static final ShapeType shapeType = ShapeType.TRIANGLE; 
	
	public Triangle( int side1, int side2, int side3, Point origin, int shapeId) {
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.origin = origin;
		this.shapeId = shapeId;
	}
	
	public int getArea() {
		int sum = getPerimeter();
		int calc = sum * (sum - side1) * (sum - side2) * (sum - side3);
		int area = (int) Math.pow(calc, 0.5);
		return area;
	}
	
	public int getPerimeter () {
		 int perimeter = side1 + side2 + side3;
		 return perimeter;
	}
	
	public Point getOrigin( ){
		return origin;
	}

	public boolean isPointEnclosed() {
		return true;
	}
	
	public ShapeType getShapeType() {
		return shapeType;
	}
	
	public int getId() {
		return shapeId;
	}
	
	private int areaThroughPoints(int x1, int y1, int x2, int y2, int x3, int y3) {
		int areaOfTri = (int) Math.abs((x1*(y2-y3) + x2*(y3-y1)+  x3*(y1-y2)) / 2.0); 
		return areaOfTri;
	}
	
	
	public boolean isPointEnclosed(Point p) {
		Point p2 = new Point ( origin.x + side1, origin.y);
		Point p3 = new Point();
		p3.x = ((side2 * side2) - (side3 * side3) - (origin.x) + (p2.x)) / (2 * (p2.x) - (origin.x));
		p3.y = ((int)(Math.sqrt((side2 * side2) - ((p3.x - origin.x) * (p3.x - origin.x))))) + origin.y;
		
		int A = getArea();
		int A1 = areaThroughPoints (p.x, p.y, p2.x, p2.y, p3.x, p3.y);
		int A2 = areaThroughPoints (p.x, p.y, p2.x, p2.y, origin.x, origin.y);
		int A3 = areaThroughPoints (p.x, p.y, origin.x, origin.y, p3.x, p3.y);
		return (A == A1 + A2 + A3);
	}
}
