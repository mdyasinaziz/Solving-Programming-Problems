package net.properbd.assignment04;

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = k.nextInt();
		
		for(; number > 0; number /= 10){
			System.out.println(number % 10);
		}
		
		k.close();
	}

}
