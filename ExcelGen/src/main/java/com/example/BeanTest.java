package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="beanTest")
@Scope("prototype")
public class BeanTest {
	
	@Autowired
	BeanTest2 beanTest;
	
public String name = "Pratik";

@PostConstruct
public void initIt1() throws Exception {
  System.out.println("In Bean Test ");
}
}
