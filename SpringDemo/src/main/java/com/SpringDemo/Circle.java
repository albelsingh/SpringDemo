package com.SpringDemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;


public class Circle implements Shape{
     
	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void draw() {
		System.out.println("Drawing Circle ");
		System.out.println("Point are = "+center.getX()+","+center.getY());
		/*System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()} , "Default Point ", null));
		System.out.println(this.messageSource.getMessage("greeting", null, "Default Hello Albel", null));
		*/
	}

	public Point getCenter() {
		return center;
	}
	@Autowired
	@Qualifier("circleRelated")
	/*@Resource(name="pointC")*/
	public void setCenter(Point center) {
		this.center = center;
	}
	
	

}
