package com.yash.stringArrayProgram_1;

import java.util.Scanner;

class StringProgram4

{  
	static int findTheSum(String alpha)
	{
	   
	    int score = 0;
	 
	    for (int i = 0; i < alpha.length(); i++)
	    {
	       
	        // Find the score
	        if (alpha.charAt(i) >= 'A' && alpha.charAt(i) <= 'Z')
	            score += alpha.charAt(i) - 'A' + 1;
	        else
	            score += alpha.charAt(i) - 'a' + 1;
	    }
	   
	    return score;
	}
	 
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();   
		
	    System.out.println(findTheSum(str));
	}
	
}
