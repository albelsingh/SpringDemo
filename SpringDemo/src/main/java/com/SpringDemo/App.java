package com.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Resource r=new ClassPathResource("resource/spring.xml");
        //BeanFactory factory=new XmlBeanFactory(r);
    	//Test  t =(Test)factory.getBean("t");
    	ApplicationContext context = new ClassPathXmlApplicationContext("resource/SpringBeans.xml");
    	Customer  cust =(Customer)context.getBean("CustomerBean");
    	cust.showDetails();
    	//System.out.println(cust.getMaps().toString());
    	
    	
    }
}
