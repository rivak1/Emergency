package com.metacube.get2019;

import java.util.ArrayList;

import com.metacube.get2019.Shape.ShapeType;

public class ShapeFactory {
	static int id = 0;
	
	public Shape createShape(String shapeName, Point p, ArrayList<Integer> list1) {
		
		Enum ShapeEnum = Enum.valueOf(ShapeType.class, shapeName.toUpperCase() );
		if (ShapeEnum == null) {
			return null;
		}
		if (ShapeEnum == ShapeType.CIRCLE) {
			return new Circle(list1.get(0), p, id++);

		} else if (ShapeEnum == ShapeType.RECTANGLE) {
			return new Rectangle(list1.get(0), list1.get(1), p, id++);

		} else if (ShapeEnum == ShapeType.TRIANGLE) {
			return new Triangle(list1.get(0), list1.get(1), list1.get(2), p, id++);
		}

		return null;
	}
}
