package net.properbd.assignment04;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = k.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i+=2){
			sum += i;
		}
		System.out.println(sum);
		
		k.close();
	}

}
