package org.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class CustomService {
	public void printInfo() {
		System.out.println("CustomService was injected into spring context!!!");
	}
}
