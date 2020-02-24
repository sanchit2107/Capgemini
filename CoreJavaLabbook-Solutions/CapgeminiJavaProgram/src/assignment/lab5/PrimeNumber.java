package assignment.lab5;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i, count;
		for(i=2; i<=n ;i++) {
			
			count = 0;
			
			for(int j=1; j<=i; j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			
			if(count == 2) {
				System.out.println(i);
			}
				
		}
		
	}

}
