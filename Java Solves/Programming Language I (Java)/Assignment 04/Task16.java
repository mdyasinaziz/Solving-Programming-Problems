package net.properbd.assignment04;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.println("Enter mark: ");
		int mark = k.nextInt();
		int max = mark;
		int min = mark;
		int sum = mark;
		for(int i = 1; i < 10; i++){
			System.out.println("Enter mark: ");
			mark = k.nextInt();
			if(mark > max){
				max = mark;
			}
			if(mark < min){
				min = mark;
			}
			sum += mark;
		}
		
		double avg = sum / 10;
		System.out.println("Minimum mark: " + min);
		System.out.println("Maximum mark: " + max);
		System.out.println("Average mark: " + avg);
		
		k.close();
	}
}
