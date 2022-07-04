package com.tns.application;

import com.tns.framework.*;
import com.tns.application.*;

public class GSPrimeAcc extends PrimeAcc
{
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges,isPrime);
	}

	
	
	@Override
	public void bookProduct(float c) 
	{
		super.bookProduct(c);
	}



	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getCharges()=" + getCharges() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
	
}
