package com.yash.Array;

public class DynamicArray 
{
	
		    private int array[];
		    private int count;
		 
		    public DynamicArray(int length)
		    { 
		    	array = new int[length]; 
		    }
		
		    public void printArray()
		    {
		
		        for (int i = 0; i < count; i++) 
		        {
		            System.out.print(array[i] + " ");
		        }
		    }
		
		    public void insert(int element)
		    {
		 
		        if (array.length == count) 
		        {
		            int newArray[] = new int[2 * count];
		            for (int i = 0; i < count; i++) 
		            {
		            	newArray[i] = array[i];
		            }
		            array = newArray;
		        }
		 
		        array[count++] = element;
		    }

	}

