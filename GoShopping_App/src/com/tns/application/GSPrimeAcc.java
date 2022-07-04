package com.tns.application;

import com.tns.framework.*;
import com.tns.application.*;

public class GSPrimeAcc extends PrimeAcc
{
	
	public GSPrimeAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges,deliveryCharges);
	}
	
	public GSPrimeAcc() {
		super(accNo, accNm, charges,deliveryCharges);
	}

	
	
	@Override
	public void bookProduct(float c) 
	{
		super.bookProduct(c);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [getDeliveryCharges()=" + getDeliveryCharges() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getCharges()=" + getCharges() + ", getAccNm()=" + getAccNm()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
