package net.properbd.assignment04;

import java.util.Scanner;

public class Task29 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		
		System.out.println("Enter a number: ");
		int n = k.nextInt();
		int sumOfDivisors = 0;
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				sumOfDivisors += i;
			}
		}
		if(sumOfDivisors == n){
			System.out.println("Perfect number");
		} else {
			System.out.println("NOT Perfect number");
		}
		
		k.close();
	}

}
