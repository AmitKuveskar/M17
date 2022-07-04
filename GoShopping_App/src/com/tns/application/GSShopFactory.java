package com.tns.application;

import com.tns.framework.*;

//To access Interface method
public class GSShopFactory implements ShopFactory {
	
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges,boolean isPrime ) {
		GSPrimeAcc gsp = new GSPrimeAcc(accNo, accNm, charges, isPrime); //created object for Prime
		return gsp;
	}
	
	
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc gsn = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return gsn;
	}
	

}
