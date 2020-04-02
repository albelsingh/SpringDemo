package com.SpringDemo;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

public class Triangle
{
	

	private List<Point> points;
/*	private Point pointB;
	private Point pointC;*/

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		
		for(Point point: points)
		{
		System.out.println(" point = (" +point.getX() +"," + point.getY() + ")");

		}
		}

/*	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		
		System.out.println("point A = ("+ getPointA().getX()+" , "+ getPointA().getY()+")");
		System.out.println("point B = ("+ getPointB().getX()+" , "+ getPointB().getY()+")");
		System.out.println("point C = ("+ getPointC().getX()+" , "+ getPointC().getY()+")");
			
		} */
	

}
