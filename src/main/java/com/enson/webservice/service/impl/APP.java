package com.enson.webservice.service.impl;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class APP {
	public static void main(String[] args) throws Exception{ 
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml"); 
		context.start(); // 阻塞 
		System.in.read(); 
		}
	}
	 
 
