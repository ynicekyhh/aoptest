package com.bigdata2017.aoptest;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public ProductVo find( String keyword ) {
		
		System.out.println("finding....");

//		if( 1 == 2-1 ) {
//			throw new RuntimeException( "exceptionoccrs" );
//		}
		
		return new ProductVo( keyword );
	}
}
