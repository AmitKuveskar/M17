package com.tns.corejava;

public class DoWhile {
public static void main(String[] args) {
		
//		int x=0;
//		do 
//		{
//			System.out.println("hello");
//		    x++;
//		}
//		while(x<10);
//		
	
//		
		int x=0;
		do
		{
			x++;
			System.out.println(x);
			
			if(++x < 5)
				continue;// skip the iteration current
			x++;//6 10
			
			System.out.println(x);
			
		}while(++x<10);//3<10 7<10 11<10
		
	
	
	}

}
