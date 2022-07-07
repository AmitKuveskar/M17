package com.tns.corejava;

public class Child extends Parent {
 int age;
 
 public static void main(String[] args) {
	 
	 Parent p1 = new Parent();
	 System.out.println(p1.name);
	 
	 Child c1 = new Child();
	 System.out.println(c1.age);
 }
}
