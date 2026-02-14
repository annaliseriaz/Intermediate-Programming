package intermediateprogramming;
import java.util.Scanner;
public class TextAnalyzer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String words = sc.nextLine();
		System.out.print("Enter an index: ");
		int index = sc.nextInt();
		
		if (index >= 0 && index < words.length()) {
			System.out.println("Character at index " + index + ": " + words.charAt(index));
		} else {
			System.out.println("Invalid index!");
		}
		sc.close(); 
	}
}
