package assignment.lab1;
import java.util.Scanner;

public class SumNNatural {
	public static int calculateSum(int n)
	{
		int temp = 0;
		for(int i=1; i<=n; i++)
		{
			if(i%3 ==0 || i%5 == 0)
			{
				System.out.println(i);
				temp = temp + i;
			}
				
		}
			
		return temp;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int sum1 = calculateSum(n);
		System.out.println("Sum of "+ n + " natural numbers are "+ sum1);
		sc.close();
	}
}
