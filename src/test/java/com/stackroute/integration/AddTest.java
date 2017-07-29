package com.stackroute.integration;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AddTest 
{

	static AddDemo addDemo; 
	
	@BeforeClass
	public static void initialize()
	{
		addDemo=new AddDemo();
	}
	
	@Test
	public void testSum() 
	{
		assertEquals(30,addDemo.sum(10, 20));
	}

	@Test
	public void testAdd() 
	{
		assertEquals(4,addDemo.sum(1, 3));
	}
}
