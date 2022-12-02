package com.prototype;

public class Prototype  {
	
	//if object creation takes much time ,instead of creating the object 
	//again and again we can clone the object (this cloning process is prototype )
	
	//cloning:1.shallow cloning -
	       // 2. deep cloning
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		BookShop s1=new BookShop();
		s1.setShop1(12345);
		s1.loadData();
		for(Book book: s1.books) {
			System.out.println(book);	
		}
		
		
		//creating new shop will require the entire object creation
		//to avoid that we can clone the shop1 object to create shop2 
		
		//BookShop s2=new BookShop();
		
		BookShop s2=(BookShop)s1.clone();
		
		System.out.println(s2.toString());
		//s2.loadData();
		
		

	}

}
