package com.stackroute.integration;

public class AddDemo 
{
	public int sum(int num1,int num2)
	{
		return num1+num2;
	}
	
	public static void main(String arg[])
	{
		AddDemo obj=new AddDemo();
		System.out.println(obj.sum(10,20));
	}
}
