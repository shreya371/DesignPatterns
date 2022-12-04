package com.iterator;

public class Fruits implements Basket{
	public String fruits[]= {"mango","apple","banana"};

	@Override
	public Iterator getIterator() {
		
		
		return new FruitsIterator();
	}
	private class FruitsIterator implements Iterator{
		int index;
		@Override
		public boolean hasNext() {
			
			
			
			if(index < fruits.length){
		            return true;
		         }
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()){
	            return fruits[index++];
	         }
			return null;
		}
		
	}
	

}
