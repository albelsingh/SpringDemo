package com.SpringDemo;

public class Circle implements Shape{
     
	private Point center;
	
	public void draw() {
		System.out.println("Drawing Circle ");
		System.out.println("Point are = "+center.getX()+","+center.getY());
		
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	

}
