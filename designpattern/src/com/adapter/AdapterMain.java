package com.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidCharger androidCharger =new AndroidCharger();
		AndroidPhone androidPhone = new OnePlus9();
		androidCharger.charge(androidPhone);
		
		IphoneCharger iphoneCharger =new IphoneCharger();
		Iphone iphone =new Iphone13();
		iphoneCharger.charge(iphone);
		

		AndroidToIphoneAdapter adapter =new AndroidToIphoneAdapter(androidPhone);
		iphoneCharger.charge(adapter);
		

	}

}
