package com.yash.Array;

import java.util.Scanner;

public class ArrayProgram5 {

	public static void main(String[] args) 
	{
		int n, sumOfeven = 0, sumOfodd = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
            	sumOfeven = sumOfeven + a[i];
            }
            else
            {
            	sumOfodd = sumOfodd + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumOfeven);
        System.out.println("Sum of Odd Numbers:"+sumOfodd);
	 
        int count, sum = 0;  
      for(int number = 1; number <= n; number++)  
      {  
      count = 0;  
      for (int i = 2; i <= number/2; i++)  
      {  
       if(number % i == 0)  
      {  
      count++;  
      break;  
      }  
      } 
      if(count == 0 && number != 1 )  
      {       
      sum = sum + number;  
      System.out.println("The Sum of Prime Numbers is: " + sum);  
      }  
      }
      
      }
}
