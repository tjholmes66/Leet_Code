package com.tomholmes.products.leetcode;

public class MyInterviewCode {
	
	//Write the code to identify and print the largest value in this list
	// List of Integer type elements - 2, 4, 1, 7, 13, 7, 9, 13, 14, 6
	
	public static final void main(String args[]) {
		
		int[] numbers = new int[] {2, 4, 1, 7, 13, 7, 9, 13, 14, 6};
		
		int temp = 0;
		for(int i = 0 ; i < numbers.length ; i++) {
			
			// System.out.println("i=" + i + ", numbers[i]=" + numbers[i]);
			
			if(  numbers[i] > temp) {
				temp = numbers[i];
			}
			
		}
		System.out.println(temp);
		
	}

}
