package test;

import java.util.Scanner;
import domain.Exercise;
/**
 * Містить реалізацію виводу результатів
 * @author IT-Service
 */
public class TestResult {
	private static Scanner input;
	/**
	 * Метод який містить вивід результатів методу isPalindrome
	 * @param args - містить аргументи що надаються
	 */
	public static void main(String [] args){
		input = new Scanner(System.in);
		System.out.print("Input name: ");
		String text = input.nextLine();
		text = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
		Exercise res = new Exercise();
		if(res.isPalindrome(text)){
		    System.out.println(text + " - Palindrome");
		} else {
		    System.out.println(text + " - Not a Palindrome");
		}
		
    }
}
