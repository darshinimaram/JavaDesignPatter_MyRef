package com.structuralDesignPattern.flyweight;

public class ConcreteCircle implements Circle{
	private String colour;
	private int x;
	private int y;
	
	public ConcreteCircle(String colour)
	{
		this.colour=colour;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a "+ colour +"circle at ( "+ x+"+"+y+")" );
	}

	@Override
	public void setPosition(int x, int y) {
		// TODO Auto-generated method stub
		this.x=x;
		this.y=y;
	}

}
