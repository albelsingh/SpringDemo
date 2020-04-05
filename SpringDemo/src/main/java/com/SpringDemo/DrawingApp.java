package com.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class DrawingApp {


	public static void main(String[] args) { 
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml"); //Itializing application context or start container.
		Shape  shape =(Shape)context.getBean("circle");
		shape.draw();    
	}

}
