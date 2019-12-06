package com.metacube.get2019;

public class Circle implements Shape {
	private int radius;
	private Point origin;
	private static final Shape.ShapeType shapeType = ShapeType.CIRCLE; 
	private int shapeId;
	
	public Circle( int radius, Point origin, int shapeId) {
		this.radius = radius;
		this.origin = origin;
		this.shapeId = shapeId;
	}
	
	public int getArea() {
		int area = ( 22 * radius * radius ) / 7;
		return area;
	}
	
	public int getPerimeter () {
		 int perimeter = ( 2 * 22 * radius ) / 7;
		 return perimeter;
	}
	
	public Point getOrigin( ){
		return origin;
	}

	public boolean isPointEnclosed() {
		return true;
	}
	
	public Shape.ShapeType getShapeType() {
		return shapeType;
	}
	
	public int getId() {
		return shapeId;
	}
	
	public boolean isPointEnclosed(Point p) {
		int[] center = getCenter();
		int distance = (int)(Math.sqrt((center[0] - p.x) * (center[0] - p.x) + (center[1] - p.y)* (center[1] - p.y)));
		if (distance <= radius) {
			return true;
		}
		return false;	
	}
	
	public int[] getCenter() {
		int toOriginLen = (int)(Math.sqrt(origin.x * origin.x + origin.y * origin.y));
		int toCenterLen = toOriginLen + radius;
		
		int[] centerPoint = new int[2];
		
		centerPoint[0] = ( toCenterLen * origin.x ) / toOriginLen;
		centerPoint[1] = ( toCenterLen * origin.y ) / toOriginLen;

		return centerPoint;
	}
}
