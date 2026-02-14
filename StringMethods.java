package intermediateprogramming;
import java.util.Scanner;
import java.text.*;
public class StringMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();
		System.out.print("Enter an index: ");
		int index = scanner.nextInt();
		if (index >= 0 && index <
		sentence.length()) {

		System.out.println("Character at index " + index + ": " + sentence.charAt(index));
		} else {
		System.out.println("Invalid index!");
		}
		SentenceMaker();
	}
	
	public static void SentenceMaker() {
		Scanner wait = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String maker = wait.nextLine();
	}
}
