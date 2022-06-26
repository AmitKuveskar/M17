package com.tns.corejava;

public class Outer {
	static int x=10;
		static class Inner{
			public void demo() {
				System.out.println("Inner Class");
				x=100;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner obj = new Outer.Inner();
				obj.demo();
	}

}
