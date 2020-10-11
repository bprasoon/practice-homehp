package com.personal.prasoon;

public class Inheritance{

	public static void main(String args[])
	{
		System.out.println("Hello how are you");
		int z=Inheritance.test(6);
		int j = 5;
		int i=5;
		j=z;
		System.out.println(j);
		System.out.println(i);
		
		
	}

	public static int test(int x)
	{
		int y= x+x;
		return y;
		
	}
	
}
