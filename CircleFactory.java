package com.structuralDesignPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {
	public static final Map<String, Circle> circleMap=new HashMap<>();
	
	public static Circle getCircle(String colour) {
		Circle circle=circleMap.get(colour);
		if(circle==null) {
			circle=new ConcreteCircle(colour);
			circleMap.put(colour, circle);
			System.out.println("Creating a "+colour+" circle");
		}
		return circle;
	}

}
