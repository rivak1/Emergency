package com.metacube.get2019;

import java.util.ArrayList;
import java.util.List;

import com.metacube.get2019.Shape.ShapeType;

public class Screen {
	
	List<Shape> shapeObj = new ArrayList<Shape>(); 	
	
	public boolean addObject(Shape obj) {
		shapeObj.add(obj);
		return true;
	}

	public boolean deleteObject(int id) {
		for (int i = 0; i < shapeObj.size(); i++) {
			if (shapeObj.get(i).getId() == id) {
				shapeObj.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteAllObj(String shapeName) {
		Enum ShapeEnum = Enum.valueOf(ShapeType.class, shapeName.toUpperCase() );
		for (int i = 0; i < shapeObj.size(); i++) {
			if (shapeObj.get(i).getShapeType() == ShapeEnum) {
				shapeObj.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public List<Shape> sortAccArea() {
		for (int i = 0; i < shapeObj.size(); i++) {
			for (int j = 0; j < (shapeObj.size() - i - 1); j++) {
				if (shapeObj.get(j).getArea() > shapeObj.get(j + 1).getArea()) {
					
					Shape temp = shapeObj.get(j);
					shapeObj.set(j, shapeObj.get(j + 1));
					shapeObj.set(j + 1, temp);
				}
			}
		}
		return shapeObj;
	}
	
	public List<Shape> sortAccPerimeter() {
		for (int i = 0; i < shapeObj.size(); i++) {
			for (int j = 1; j < (shapeObj.size() - i); j++) {
				if (shapeObj.get(j - 1).getPerimeter() > shapeObj.get(j).getPerimeter()) {
					
					Shape temp = shapeObj.get(j - 1);
					shapeObj.set(j - 1, shapeObj.get(j));
					shapeObj.set(j, temp);
				}
			}
		}
		return shapeObj;
	}
	
	public List<Shape> isPointEnclosedInShape(Point p) {
		List<Shape> isEnclose = new ArrayList<>();
		
		for (int i = 0; i < shapeObj.size(); i++) {
			Shape obj = shapeObj.get(i);
			if (obj.isPointEnclosed(p)) {
				isEnclose.add(obj);
			}
		}
		return isEnclose;
	}
	
	
}
