package assignment.lab5;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String input = sc.next();
			switch(input)
			{
			case "red":
				System.out.println("Please Stop!!");
				break;
			case "yellow":
				System.out.println("Be Ready!!");
				break;
			case "green":
				System.out.println("Go...");
				break;
			default:
				System.out.println("Invalid Choice!!!");
				break;
			}	
		sc.close();
	}

}
