package com.tns.framework;

import com.tns.framework.*;
import com.tns.application.*;

public class PrimeAcc extends ShopAcc
{

	protected static float deliveryCharges = 00;
	
	
	
	public PrimeAcc(int accNo, String accNm, float charges, float deliverycharges) 
	{
		super(accNo, accNm, charges);
		
		this.deliveryCharges = deliveryCharges;
	}
	public float getDeliveryCharges() 
	{
		return deliveryCharges;
	
	}
	
	@Override
	public void bookProduct(float c) 
	{
		super.bookProduct(c);
	}
	
	@Override
	public String toString() {
		return "PrimeAcc [getDeliveryCharges()=" + getDeliveryCharges() + ", getAccNo()=" + getAccNo()
				+ ", getCharges()=" + getCharges() + ", getAccNm()=" + getAccNm() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	
	
}
