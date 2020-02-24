package assignment.lab3;

import java.awt.List;
import java.util.ArrayList;

public class ArraySecondLargetElement {
	
	public static int getSecondSmallest(int arr[]) {
		int first, second;
		first = second = Integer.MAX_VALUE;
		int arr_size = arr.length;
		for(int i=1; i<arr_size; i++)
		{
			if(arr[i]<first)
			{
				second = first;
				first = arr[i];
			}
			else if(arr[i]<second && arr[i]!=first)
			{
				second = arr[i];
			}
		}
		
		if(second == Integer.MAX_VALUE)
			return 0;
		else
			return second;
		
	}

	public static void main(String[] args) {
		
		// System.out.println("Enter elements to enter into Array:");
		
		int []arr = {25, 2, 10, 12, 30, 6, 36};
		int secondSmallestElement =  getSecondSmallest(arr);
		
		if(secondSmallestElement != 0)
			System.out.println("Second Largest Element is:= "+ secondSmallestElement);
		else
			System.out.println("Invalid Inputs");
	}

}
