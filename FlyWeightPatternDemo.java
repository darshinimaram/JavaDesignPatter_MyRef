package com.structuralDesignPattern.flyweight;

public class FlyWeightPatternDemo {
private static final String[] colors= {"Red","Yellow","Green","Blue","Black"};

public static void main(String[] args) {
	for(int i=0;i<20;i++) {
		Circle circle=CircleFactory.getCircle(getRandomColour());
		circle.setPosition(getRandomx(), getRandomy());
		circle.draw();
	}
	}
private static String getRandomColour() {
	return colors[(int)(Math.random()*colors.length)];
}
private static int getRandomx() {
	return (int) (Math.random()*100);
}
private static int getRandomy() {
	return (int) (Math.random()*100);
}
}
