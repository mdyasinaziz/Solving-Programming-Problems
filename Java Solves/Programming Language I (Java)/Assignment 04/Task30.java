package net.properbd.assignment04;

import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int start = k.nextInt(), end = k.nextInt();
		int sumOfDivisors = 0, primeCount = 0, perfectCount = 0;
		boolean isPrime;

		for (int n = start; n <= end; n++) {
			isPrime = true;
			sumOfDivisors = 0;
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					if(i != 1) isPrime = false;
					sumOfDivisors += i;
				}
			}
			if(sumOfDivisors == n){
				perfectCount++;
			}
			if(isPrime){
				primeCount++;
			}
		}
		
		System.out.println("Between " + start + " and " + end + ", Found " + primeCount + " Prime number\nFound " + perfectCount + " Perfect number");
		k.close();
	}

}
