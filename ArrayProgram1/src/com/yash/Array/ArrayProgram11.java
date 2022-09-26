package com.yash.Array;

import java.util.Scanner;

public class ArrayProgram11
{
	static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }
   static String removePalinWords(String str)
   {
       String final_string = "", word = "";

        str = str + " ";
        int n = str.length();
       for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ')
                word = word + str.charAt(i);
            else {
                if ((isPalindrome(word)))
                	final_string += word + " ";
                word = "";
            }
        }

       return final_string;
    }

   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str=sc.nextLine();
        System.out.print(removePalinWords(str));
    }
}
