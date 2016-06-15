package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanTest2 {
	@Autowired
	BeanTest beanTest;
	
	@PostConstruct
	public void initIt1() throws Exception {
	  System.out.println("In Bean Test 2 ");
	}
	
}
