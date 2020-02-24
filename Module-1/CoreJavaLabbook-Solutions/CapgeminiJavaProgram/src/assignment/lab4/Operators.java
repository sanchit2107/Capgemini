package assignment.lab4;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			int rem = n%10;
			sum = sum + rem*rem*rem;
			n = n/10;
		}
		
		System.out.println("Sum of the cubes of the digits = " + sum);

	}

}
