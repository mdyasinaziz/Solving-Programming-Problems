package net.properbd.assignment04;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = k.nextInt();
		int digits = 0, power = 1;
		for(int temp = number; temp > 0; temp /= 10){
			digits++;
		}
		for(int temp = digits - 1; temp > 0; temp-- ){
			power *= 10;
		}
		for(; power > 0; power /= 10){
			System.out.println(number / power);
			number %= power;
		}
		
		k.close();
	}

}
