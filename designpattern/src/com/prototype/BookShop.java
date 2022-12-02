package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	
	private int shop1;
	List<Book> books=new ArrayList<>();
	
	
	public void loadData() {
		
		Book b1= new Book(101,"book1");
		books.add(b1);
		Book b2= new Book(102,"book2");
		books.add(b2);
		Book b3= new Book(103,"book3");
		books.add(b3);
		Book b4= new Book(104,"book4");
		books.add(b4);
		Book b5= new Book(105,"book5");
		books.add(b5);
		
	}
	
	
	
	
	
	
	
	public int getShop1() {
		return shop1;
	}
	public void setShop1(int shop1) {
		this.shop1 = shop1;
	}

	@Override
	public String toString() {
		return "BookShop [shop1=" + shop1 + ", books=" + books + "]";
	}







	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
	
			
	
	
	

}
