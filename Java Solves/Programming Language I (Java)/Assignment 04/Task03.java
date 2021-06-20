package net.properbd.assignment04;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner k = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int number = k.nextInt();
		int sum = number;
		int max = number;
		
		for(int i = 1; i < 20; i++){
			System.out.println("Enter a number: ");
			number = k.nextInt();
			sum += number;
			if(number > max){
				max = number;
			}
		}
		
		double avg = sum / 20;
		System.out.println("Average: " + avg);
		System.out.println("Maximum: " + max);
		
		k.close();
	}

}
