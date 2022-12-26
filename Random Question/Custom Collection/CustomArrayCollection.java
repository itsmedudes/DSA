package com.masai.CustomCollection;

public class CustomArrayCollection {
	
	Object arr[] = new Object[5];
	int elementCount = 0;
	
	public void add(Object obj) {
		if(arr.length==elementCount) {
			increaseTheArrayCapacity();
		}
		arr[elementCount]=obj;
		elementCount++;
	}
	
	public void increaseTheArrayCapacity(){
		int size = arr.length*2;
		Object newArray[] = new Object[size];
		
		for(int i=0;i<arr.length;i++) {
			newArray[i]=arr[i];
		}
		arr = newArray;
	}
	

}

