package assignment.lab3;

import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberSortedArray {
	
	public static Integer[] getSorted(TreeSet<Integer> int_arr)
	{
		int size = int_arr.size();
		Integer arr[] = new Integer[size];
		arr = int_arr.toArray(arr);
		
		for(int i=0; i<size; i++)
		{
			String val = String.valueOf(arr[i]);
			String rev_val = new StringBuilder(val).reverse().toString();
			arr[i] = Integer.parseInt(rev_val);
		}
		
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		
		TreeSet<Integer> int_arr = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int number = sc.nextInt();
			int_arr.add(number);
		}
		
//		System.out.println(int_arr);
		int size = int_arr.size();
		Integer result_arr[] = getSorted(int_arr);
		
		System.out.println("Array after Revrsing the number and Soretd are as follows: ");
		for(int i: result_arr)
			System.out.print(i + "  ");
		
	}

}
