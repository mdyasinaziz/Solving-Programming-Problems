package net.properbd.assignment04;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner k = new Scanner (System.in);
		
		System.out.println("Enter the name of your favourite car: ");
		String carname = k.next();
		System.out.println("Enter a number: ");
		int n = k.nextInt();
		
		for(int i = 0; i < n; i++){
			System.out.println(carname);
		}
		
		k.close();
	}

}
