package com.zeke.recapitulare3.Shape;

public class Circle extends Shape{
	
	protected double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius,2);
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * this.radius;
	}


}
