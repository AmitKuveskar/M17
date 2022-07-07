package com.tns.corejava;

public class Constructor {
	Constructor() {
		System.out.println("Constructor()");
		}
		public static void main(String[] args) {
		System.out.println("main Begin");
		Constructor obj = new Constructor();
		System.out.println("main End");
		}

}
