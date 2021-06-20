package net.properbd.assignment04;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = k.nextInt();
		boolean isPrime = true;
		
		for(int i = 2; i <= n / 2; i++){
			if(n % i == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println("Prime number");
		} else {
			System.out.println("NOT Prime number");
		}
		
		
		k.close();
	}

}
