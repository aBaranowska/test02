package com.rec.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleServiceTest {

	private ApplicationContext context;

	@Before
	public void setUp() {
		context = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
	}

	@After
	public void tearDown() {
		((AbstractApplicationContext) context).close();
	}

	@Test(expected = NoUniqueBeanDefinitionException.class)
	public void getBean() {
		context.getBean(Service.class);
	}

}
