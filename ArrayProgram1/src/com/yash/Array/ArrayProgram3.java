package com.yash.Array;

public class ArrayProgram3 {

	public static void main(String[] args)
	{
		DynamicArray addNumber = new DynamicArray(6);
    	addNumber.insert(56);
    	addNumber.insert(67);
    	addNumber.insert(40);
    	addNumber.insert(50);
    	addNumber.insert(90);
    	addNumber.insert(120);
    	addNumber.insert(354);
    	addNumber.insert(150);
    	addNumber.insert(34);
    	
    	addNumber.printArray();
	}

}
