package assignment.lab1;
import java.util.Scanner;

public class PowerOfTwo {
	public static boolean checkNumber(int n)
	{
		while(n != 1)
		{
			if(n%2 != 0)
				return false;
			n = n/2;
		}
		return true;
			
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		boolean result = checkNumber(n);
		if(result == true)
			System.out.println("Input is power of 2");
		else
			System.out.println("Input is not power of 2");
		
		sc.close();
	}
}				
