package com.bigdata2017.aoptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
    	ApplicationContext ac = 
    			new ClassPathXmlApplicationContext("config/applicationContext.xml");
    
    	ProductService ps = 
    	ac.getBean( ProductService.class );
    	
    	ProductVo vo = ps.find( "camera" );
    	//System.out.println( vo );
    }
}
