package com.yash.Array;
import java.util.Scanner;

public class Arrayprogram1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array elemnts : ");
		for (int i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < size; i++)
		{
			for (int j = i + 1; j < size; j++)
			{
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		int i;
		for (i = 0; i < size; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("third minimum number :" + a[2]);
	}

}
