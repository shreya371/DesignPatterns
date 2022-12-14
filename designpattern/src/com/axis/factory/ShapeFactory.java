package com.axis.factory;

import com.axis.models.Circle;
import com.axis.models.Rectangle;
import com.axis.models.Shape;

public class ShapeFactory {

	// this methods returns the shape object
	//factory pattern -unnecessary object creation is reduced,can only create objects which are needed to us
public Shape getShape(String shapeType)
	{
		if(shapeType==null)
			return null;
		if(shapeType.equalsIgnoreCase("circle"))
			return new Circle();
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		return null;
	}
}
