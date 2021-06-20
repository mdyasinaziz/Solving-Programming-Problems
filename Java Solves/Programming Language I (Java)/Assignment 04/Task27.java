package net.properbd.assignment04;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		
		boolean isPrime = true;
		for (int n = 3; n < 1000; n++) {
			isPrime = true;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.println(n);
			}
		}

		k.close();
	}

}
