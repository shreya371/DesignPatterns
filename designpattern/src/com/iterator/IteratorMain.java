package com.iterator;

public class IteratorMain {
	public static void main(String[] args) {
	Fruits f=new Fruits();
	
	for(Iterator i = f.getIterator();i.hasNext();) {
		String fruit =(String)i.next();
		System.out.println(fruit);
	}
	}
}
