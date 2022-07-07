package com.tns.corejava;

public class MultipleClasses {
	static int x;
	public static void main(String[] args) {
	System.out.println("x1 : " +x);
	System.out.println("x2 : "
	+ MultipleClasses.x);
	}
	}
	class C {
	public static void main(String[] args) {
	System.out.println("x3 : "
	+ MultipleClasses.x);
	}

}
