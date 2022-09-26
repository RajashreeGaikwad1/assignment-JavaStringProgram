package com.yash.Array;

import java.util.Scanner;

public class ArrayProgram6 {

	public static void main(String[] args)
	{
			int number, sum = 0;
		    float average;
		    Scanner s = new Scanner(System.in);
		    System.out.println("Enter the size of Array");
		    number = s.nextInt();
		    int a[] = new int[number];
		    System.out.println("Enter all the elements:");
		    for(int i = 0; i < number ; i++)
		    {
		        a[i] = s.nextInt();
		        sum = sum + a[i];
		    }
		    System.out.println("Sum:"+sum);
		    average = (float)sum / number;
		    System.out.println("Average:"+average);
		}

}
