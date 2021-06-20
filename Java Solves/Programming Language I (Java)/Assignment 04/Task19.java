package net.properbd.assignment04;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = k.nextInt();
		
		long product = 1;
		for(; number > 0; product *= 10, number--){}
		
		System.out.println("Product: " + product);
		
		k.close();
	}

}
