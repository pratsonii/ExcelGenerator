package com.example;

import java.io.File;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

@RestController
public class AppController 
{
	@Autowired
	appService app;
	
	@Autowired
    private WebApplicationContext context;

	@RequestMapping(value="/get",produces = "application/vnd.ms-excel")
	public FileSystemResource getExcel(HttpServletResponse response)
	{
		try
		{
		response.addHeader("Content-Disposition", "attachment; filename=testing.xlsx");
		FileSystemResource fsr = new FileSystemResource(app.gen());
		
		return fsr;
		}
		finally
		{
			File f = new File("howtodoinjava_demo.xlsx");
			f.delete();
		}
	}
	
	@RequestMapping(value="/getS")
	public String get()
	{
		return ((BeanTest)context.getBean("beanTest")).name;
	}
	
	@PostConstruct
	public void initIt1() throws Exception {
	  System.out.println("Init method after properties are set : ");
	}
}
