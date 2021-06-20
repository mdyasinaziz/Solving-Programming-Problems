package net.properbd.assignment04;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = k.nextInt();
		int length = 0;
		for(; num > 0; num /= 10 ){
			length++;
		}
		System.out.println("Length: " + length);
		
		k.close();
	}

}
