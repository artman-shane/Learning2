/*
 * Learning2.java
 *
 * The Learning2.java Class for the Learning2 project
 * Created in the learning2 package.
 * 
 * Created on Jan 22, 2019 at 11:42:05 PM
 * Created by artieman1
 *
 *
 * Purpose: <What is the purpose of the file?>
 */


package learning2;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * @author artieman1
 *
 */
public class Learning2 {
	private static Scanner keyboard = new Scanner(System.in);
	private static ArrayList<String> list = new ArrayList();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter the first value");
		// Adding items to the list - Item 1
		list.add(keyboard.nextLine());
		System.out.println("Please enter the second value");
		// Adding items to the list - Item 1
		list.add(keyboard.nextLine());
		System.out.println("Please enter the last value");
		// Adding items to the list - Item 1
		list.add(keyboard.nextLine());
		
		// Example of a lambda function to print the elements in the ArrayList
		System.out.println("Here is an example of the Array List printed from a Lambda function");
		list.forEach(s ->System.out.println(s));
		
		
		// Example of a for loop to iterate through the ArrayList
		System.out.println("Here is an example of the Array List printed from a for loop");
		for (String listElement : list) {
			System.out.println(listElement);
		}
		
		//Sorting the list - Comparator
		list.sort((s1,s2)-> s1.compareToIgnoreCase(s2));
		System.out.println("Here is the list sorted with a comparator");
		list.forEach(s -> System.out.println(s));
		//Sorting the list - Natural Order
		list.sort(null);
		System.out.println("Here is the list sorted in natural order");
		list.forEach(s -> System.out.println(s));
		
		
	}

}
