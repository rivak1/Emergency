package com.metacube.get2019;

import com.metacube.get2019.Shape.ShapeType;

public class Rectangle implements Shape {
	private int height, base;
	private Point origin;
	private int shapeId;

	private static final Shape.ShapeType shapeType = ShapeType.RECTANGLE; 

	
	public Rectangle( int height, int base, Point origin, int shapeId) {
		this.height = height;
		this.base = base;
		this.origin = origin;
		this.shapeId = shapeId;
	}
	
	public int getArea() {
		int area = height * base;
		return area;
	}
	
	public int getPerimeter() {
		 int perimeter = 2 * ( height + base);
		 return perimeter;
	}
	
	public Point getOrigin(){
		return origin;
	}
	
	public int getId() {
		return shapeId;
	}

	public boolean isPointEnclosed() {
		return true;
	}
	
	public Shape.ShapeType getShapeType() {
		return shapeType;
	}
	
	public boolean isPointEnclosed(Point p) {
		if (p.x >= origin.x && p.x <= ( origin.x + base ) && p.y >= origin.y && p.y <= (origin.x + height) )
		{
			return true;
		}
		return false;
	}
}
