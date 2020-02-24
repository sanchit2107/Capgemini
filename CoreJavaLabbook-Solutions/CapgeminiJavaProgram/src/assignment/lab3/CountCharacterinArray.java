package assignment.lab3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacterinArray {
	
	public static void characterCount(char char_array[])
	{
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		for(char c: char_array)
		{
			if(charCountMap.containsKey(c))
				charCountMap.put(c, charCountMap.get(c)+1);
			else
				charCountMap.put(c, 1);
		}
		
		//Printing the character with count
		for(Map.Entry entry: charCountMap.entrySet())
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the length of the array: 5");
		int n = sc.nextInt();
		
		String inp_string = sc.next();
		char[] inp_array = inp_string.toCharArray();
		characterCount(inp_array);
	}
}
