package net.properbd.assignment04;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int sum = 0;
		int number;
		
		for(int i = 0; i < 20; i++){
			System.out.println("Enter a number: ");
			number = k.nextInt();
			sum+= number;
			System.out.println("Sum of first " + i + " number: " + sum);
		}
	}

}
