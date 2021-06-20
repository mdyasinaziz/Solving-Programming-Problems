package net.properbd.assignment04;

import java.util.Scanner;


/*Take twenty numbers input from the user and find the minimum from all numbers and the average of
the even numbers entered by the user.*/


public class Task04 {
	public static final int TWENTY = 5;
	public static void main(String[] args) {
		Scanner k = new Scanner (System.in);
		
		
		
		System.out.println("Enter a number: ");
		int number = k.nextInt();
		int sum, evenCount;
		if(number % 2 == 0){
			sum = number;
			evenCount = 1;
		} else {
			sum = 0;
			evenCount = 0;
		}
		int min = number;
		
		for(int i = 1; i < TWENTY; i++){
			System.out.println("Enter a number: ");
			number = k.nextInt();
			if (number % 2 == 0) {
				sum += number;
				evenCount++;
			}
			if(number < min){
				min = number;
			}
		}
		double avg = sum / evenCount;
		System.out.println("Average: " + avg);
		System.out.println("Minimum: " + min);
		
		k.close();
	}

}
