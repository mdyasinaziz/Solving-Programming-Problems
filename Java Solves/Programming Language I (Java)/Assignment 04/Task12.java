package net.properbd.assignment04;

import java.util.Scanner;


/*Take twenty numbers input from the user and find the minimum from all numbers and the average of
the even numbers entered by the user.*/


public class Task12 {
	public static final int TEN = 10;
	public static void main(String[] args) {
		Scanner k = new Scanner (System.in);
		
		int number, sum = 0, evenCount = 0;
		
		for(int i = 0; i < TEN; i++){
			System.out.println("Enter a number: ");
			number = k.nextInt();
			if (number % 4 == 0) {
				sum += number;
				evenCount++;
			}
		}
		double avg = sum / evenCount;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
		
		k.close();
	}

}
