package com.bigdata2017.aoptest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Before( "execution(public ProductVo com.bigdata2017.aoptest.ProductService.find(..))" )
	public void beforeAdvice() {
		System.out.println( "beforeAdvice() called" );
	}
	
	@After( "execution(* com.bigdata2017.aoptest.*.find(..))" )
	public void afterAdvice() {
		System.out.println( "afterAdvice() called" );
	}
	
	@AfterReturning( "execution(* *..ProductService.find(..))" )
	public void afterReturning() {
		System.out.println( "afterReturning() called" );
	}
	
	@AfterThrowing( value="execution(* *..*.*(..))", throwing="ex" )
	public void afterThrowing( Throwable ex ) {
		System.out.println( "afterThrowing() called:" + ex );
	}
	
	
}
