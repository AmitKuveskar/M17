package com.tns.corejava;

public class LogicalOperators {
	 public static void main(String[] args) {
		 boolean x = true;
		 boolean y = false;
		System.out.println("x && y = " + (x && y)); //(&& indicates whether both operands are true.)
		System.out.println("x || y = " + (x || y) ); //(OR operator)
		System.out.println("!(x && y) = " + !(x && y));
		System.out.println("!(x && y) = " + !(x || y));
		}


}
