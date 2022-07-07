package com.tns.corejava;

public class MethodOverloading 
{

	public void m(Object o)
	{
		System.out.println("Object Class");
	}
	public void m(String s)
	{
		System.out.println("String Class");
	}
	public void m(StringBuffer s)
	{
		System.out.println("StringBuffer Class");
	}
	

public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.m(new Object());
		
		obj.m("Amit");
	
	
	}

}
