package test;

import java.util.Scanner;
import domain.Exercise;
/**
 * Contains implementation of output of results
 * @author IT-Service
 */
public class TestResult {
	private static Scanner input;
	/**
	 * A method that contains the output of the Calculate method
	 * @param args - contains the arguments provided
	 */
	public static void main(String [] args){
		input = new Scanner(System.in);
		System.out.print("Input name: ");
		String text = input.nextLine();
		text = text.replaceAll("[^A-Za-z�-��-�0-9]", "");
		Exercise res = new Exercise();
		if(res.isPalindrome(text)){
		    System.out.println(text + " - Palindrome");
		} else {
		    System.out.println(text + " - Not a Palindrome");
		}
		
    }
}
