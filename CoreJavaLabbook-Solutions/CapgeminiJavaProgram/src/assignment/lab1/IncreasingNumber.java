package assignment.lab1;
import java.util.Scanner;

public class IncreasingNumber {
	public static void checkNumber(int nn)
	{
		int prevdigit = nn%10, rem;
		int n = nn;
		n=n/10;
		while(n>0)
		{
			rem = n%10;
			if(rem<prevdigit)
			{
				n = n/10;
				prevdigit = rem;
			}
			else
			{
				break;
			}
		}
		
		if(n == 0)
			System.out.println(nn+ " Number is Increasing Number");
		else
			System.out.println(nn + " is not an Increasing Number");
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		checkNumber(n);
		sc.close();
	}
}