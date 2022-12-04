package com.adapter;

public class AndroidToIphoneAdapter implements Iphone{
    AndroidPhone androidPhone;
	public AndroidToIphoneAdapter(AndroidPhone androidPhone) {
		this.androidPhone=androidPhone;
		
	}
	
	@Override
	public void charge() {
		// TODO Auto-generated method stub
		androidPhone.charge();
		
	}
	

}
