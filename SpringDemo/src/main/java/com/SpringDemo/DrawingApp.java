package com.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class DrawingApp {
	
/*	@Bean(name = "myCustomBeanName")
    public static Triangle getMyBeanName() 
	{
        return new Triangle();
    }*/

	public static void main(String[] args) { 
		//Resource r=new ClassPathResource("resource/spring.xml");
        //BeanFactory factory=new XmlBeanFactory(r);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml"); //Itializing application context or start container.
    	Triangle  triangle =(Triangle)context.getBean("triangle");
		triangle.draw();
		System.out.println("output = "+context.getBeanDefinitionCount());
		
        
	}

}
