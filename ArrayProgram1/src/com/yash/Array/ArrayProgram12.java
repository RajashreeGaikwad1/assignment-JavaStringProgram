package com.yash.Array;

public class ArrayProgram12 {

	public static void main(String[] args)
	{
			int[] numbers = { 10, 2, 3, 41, 12, 13, 19, 81, 9, 100,11 };
			int temp;
			System.out.println("Original Array :");
			for (int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i] + "  ");
			}

			for (int i = 0; i < numbers.length; i++) {
				for (int j = i + 1; j < numbers.length; j++) {
					if (numbers[i] % 10 > numbers[j] % 10) {
						temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;
					}
				}
			}
			System.out.println();
			System.out.println("Sorted Array :");
			for (int i = 0; i < numbers.length; i++) 
			{
				System.out.print(numbers[i] + "  ");
			}
	}
}
