package com.yash.Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayProgram8 
{
		public static void count(String str)
		{
			int vow = 0, con = 0;
		
			String ref = "aeiouAEIOU";
		
			for (int i = 0; i < str.length(); i++) 
			{
				
				if ((str.charAt(i) >= 'A'
					&& str.charAt(i) <= 'Z')
					|| (str.charAt(i) >= 'a'
						&& str.charAt(i) <= 'z')) {
					if (ref.indexOf(str.charAt(i)) != -1)
						System.out.print(str.charAt(i));
					else
						System.out.print(str.charAt(i));
					
				}
			}
		
			System.out.println("Number of Vowels = " + vow
							+ "\nNumber of Consonants = "
							+ con);
		}

		public static void main(String[] args)
		{
			String str = "#GeeksforGeeks";
		
			count(str);
		}
}
