package net.properbd.assignment04;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int number, numOfn = k.nextInt();
		long product = 1;
		for(int i = 1; i <= numOfn; i++){
			number = k.nextInt();
			product *= number;
		}
		System.out.println("Product: " + product);
		
		k.close();
	}

}
