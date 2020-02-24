package assignment.lab5;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number!!");
		int n1 = sc.nextInt();
		System.out.println("Non Recursive Method = " + fibonacci(n1));
		System.out.println("Recursive Method = " + recursiveFib(n1));

	}

	private static int recursiveFib(int n1) {
		if(n1 == 1)
			return 1;
		else if(n1 == 2)
			return 1;
		else
			return recursiveFib(n1-1) + recursiveFib(n1-2);
	}

	private static int fibonacci(int n1) {
		if(n1 == 1)
			return 1;
		if(n1 == 2)
			return 1;
		
		int num1 = 1;
		int num2 = 2;
		int arr[] = new int[n1];
		arr[0] = num1;
		arr[1] = num2;
		
		int i=2, temp=0;
		while(i<n1) {
			temp = num1 + num2;
			arr[i]  =temp;
			num1 = num2;
			num2 = temp;
			i++;
		}
		
	return arr[n1-2];
	}
}
