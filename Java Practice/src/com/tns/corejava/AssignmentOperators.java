package com.tns.corejava;

public class AssignmentOperators {
	public static void main(String args[]) {
		int x = 10;
		int y = 20;
		int z = 30;
		z = x + y;
		System.out.println("z = x + y = " + z );
		z += x ;
		System.out.println("z += x = " + z );
		z -= x ;
		System.out.println("z -= x = " + z );
		z *= x ;
		System.out.println("z *= x = " + z );
		x = 10;
		z = 15;
		z /= x ;
		System.out.println("z /= x = " + z );
		x = 10;
		z = 15;
		z %= x ;
		System.out.println("z %= x = " + z );
		}


}
