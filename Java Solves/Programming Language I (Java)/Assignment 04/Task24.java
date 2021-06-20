package net.properbd.assignment04;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = k.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.println(i);
		}
		
		k.close();
	}

}
