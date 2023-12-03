package org.springframework.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("org.springframework.service");
		CustomService customService = (CustomService) ctx.getBean("customService");
		customService.printInfo();
	}
}
