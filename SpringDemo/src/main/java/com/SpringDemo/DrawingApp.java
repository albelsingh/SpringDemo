package com.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class DrawingApp {

	public static void main(String[] args) { 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml"); //Itializing application context or start container.
		Shape  shape =(Shape)context.getBean("circle");
        shape.draw(); 
        System.out.println(context.getMessage("greeting", null, "greeting not found", null));
       
	}

}
