package net.properbd.assignment04;

public class Task09 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 600; i++){
			if(i % 7 == 0 && i % 9 == 0){
				continue;
			}
			if(i % 7 == 0){
				sum += i;
			} else if(i % 9 == 0){
				sum += i;
			}
		}
		System.out.println("Total: " + sum);
	}

}
