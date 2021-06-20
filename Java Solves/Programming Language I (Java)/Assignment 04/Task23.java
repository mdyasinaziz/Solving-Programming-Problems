package net.properbd.assignment04;

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		
		System.out.println("Enter a number: ");
		int number = k.nextInt();
		int digits = 0, power = 1;
		String sNum =  null;
		for(int temp = number; temp > 0; temp /= 10){
			digits++;
		}
		for(int temp = digits - 1; temp > 0; temp-- ){
			power *= 10;
		}
		for(; power > 0; power /= 10){
			int n = number / power;
			switch (n) {
			case 1:
				sNum = "One";
				break;
			case 2:
				sNum = "Two";
				break;
			case 3:
				sNum = "Three";
				break;
			case 4:
				sNum = "Four";
				break;
			case 5:
				sNum = "Five";
				break;
			case 6:
				sNum = "Six";
				break;
			case 7:
				sNum = "Seven";
				break;
			case 8:
				sNum = "Eight";
				break;
			case 9:
				sNum = "Nine";
				break;
			case 0:
				sNum = "Zero";
				break;
			default:
				break;
			}
			System.out.println(sNum);
			number %= power;
		}
		
		
		k.close();
	}

}
