package com.tns.client;

import java.util.Scanner;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.ShopFactory;

public class Main 
{
	public static void main(String[] args) 
	{
		final float deliveryCharges= 50;
		float item;
		boolean isPrime = false;
		
		System.out.print("Enter Acc No:\t");
		Scanner in = new Scanner(System.in);
		int AccNo = in.nextInt();
		System.out.print("Enter Acc Name:\t");
		String AccNm = in.next();
		

			System.out.print("Enter no of items you want:\t");
			item= in.nextInt();
			
			//customer type logic
			//customer type getting from user
			
					System.out.print("Enter User Type(isPrime= p or Not= n):\t");
					String answer = in.next().toLowerCase();
					
					if (answer.equals("p")) 
					{
						isPrime = true;
					    System.out.println("\n\n\n\tPrime user");
					    
					}
					else if (answer.equals("n")) 
					{
						System.out.println("\n\n\n\tNormal User");
						isPrime = false;
						
					} else 
					{ 
						System.out.println("\nSorry, I didn't catch that. Please answer (p/n)\n");
						
					}		   
				
				
				
				
				//step 1
				ShopFactory gsf = new GSShopFactory();
				
				if(isPrime)
				{
			
					//System.out.println("In GSPrimeAcc");

					//step 1
					gsf.getNewPrimeAcc(AccNo, AccNm, 1000, isPrime);

					
					
					//step 2
					//GSPrimeAcc Constructor Calling & Object Creation
					GSPrimeAcc gsp = new GSPrimeAcc(AccNo, AccNm, item, isPrime);
		
					System.out.println("Acc no\t\t: "+gsp.getAccNo());
					System.out.println("Acc Name\t: "+gsp.getAccNm());
			
					//step 4
					//Calling bookProduct()
					gsp.bookProduct(item);
			
					System.out.println("Charges\t\t: "+gsp.getCharges());
					System.out.println("Delivery Charges: "+gsp.getDeliverycharges());
				
					//step 5
					//Calling toString()
					gsp.toString();
			
				}
				else
					if(!isPrime) // Calling GSNormalAcc
					{
						//System.out.println("\n\n\n\tGSNormalAcc\n");
						
						//step 1
						gsf.getNewNormalAcc(AccNo, AccNm, 1000, deliveryCharges);
			
						//step 3
						//GSNormalAcc Constructor Calling & Object Creation
						GSNormalAcc gsn = new GSNormalAcc();
		
						System.out.println("Acc no\t\t: "+gsn.getAccNo());
						System.out.println("Acc Name\t: "+gsn.getAccNm());
					
						//step 4
						//Calling bookProduct()
						gsn.bookProduct(item);
				
						System.out.println("Charges\t\t: "+gsn.getCharges());
						System.out.println("Delivery Charges: "+gsn.getDeliveryCharges());
						
						//step 5
						//Calling toString()
						gsn.toString();
			
					}	
					
				
					
				}
		}
	


	

