package com.singleton;

public class Singleton {
	
	//singleton:only one instance is created

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj1=Car.getObject();
		Car obj2=Car.getObject();	
	}
}

class Car{
	
	//step1:static instance,create static object so that it is 
	//not used for another operations i.e calling methods
	static Car carObj= new Car();
	
	//step2:constructor should be private 
	
    private Car(){
 
    }
    
    //step3:create a static method which returns instance,
    //it returns object
    
    public static Car getObject() {
    	return carObj;
  
    }
	
	
	
	
}
