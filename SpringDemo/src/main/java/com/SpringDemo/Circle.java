package com.SpringDemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Circle implements Shape,ApplicationEventPublisherAware{
     
	private Point center;
	private ApplicationEventPublisher publisher;
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
		DrawEvent drawevent=new DrawEvent(this);
		publisher.publishEvent(drawevent);
		
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

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}
	
	

}
