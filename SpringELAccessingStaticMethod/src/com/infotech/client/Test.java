package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.RandomNumberGenerator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx =new ClassPathXmlApplicationContext("Beans.xml");
		
		 RandomNumberGenerator randomNumberGenerator = ctx.getBean("randomNumberGenerator", RandomNumberGenerator.class);
		 
		 System.out.println(randomNumberGenerator.getRandomNumber());
		 System.out.println(randomNumberGenerator.getPi());
		 ((AbstractApplicationContext) ctx).close();
	}

}
