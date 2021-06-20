package net.properbd.assignment04;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args){
		Scanner k = new Scanner(System.in);
		
		method1();
		method2();
		
		k.close();
	}
	
	private static void method1() {
		int sum = 0;
		for(int i = 63; i < 600; i+=63){
			sum += i;
		}
		System.out.println("Total: " + sum);
	}
	
	private static void method2(){
		int sum = 0;
		for(int i = 1; i < 600; i++){
			if(i % 7 == 0 && i % 9 == 0){
				sum += i;
			}
		}
		System.out.println("Total: " + sum);
	}
}
