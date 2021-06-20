package net.properbd.assignment04;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args){
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = k.nextInt();
		int sum = 0;
		int sign = 1;
		
		for(int i = 1; i <= n; i++){
			sum += (i * i * i * sign);
			sign = -sign;
		}
		System.out.println(sum);
		
		k.close();
	}
}
