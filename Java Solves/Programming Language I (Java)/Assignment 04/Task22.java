package net.properbd.assignment04;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = k.nextInt();
		String sNum = null;
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
		k.close();
	}

}
