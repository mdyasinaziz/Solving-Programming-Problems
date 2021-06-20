package net.properbd.assignment04;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int n1, n2 = 1, n3 = 1;
		
		for(n1 = 0; n1 < 1600; n1 = n2 + n3){
			n2 = n3;
			n3 = n1;
			System.out.println(n3);
		}
		
	}

}
