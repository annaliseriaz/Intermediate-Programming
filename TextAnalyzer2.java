package intermediateprogramming;
import java.util.Scanner;
public class TextAnalyzer2 {

	public static void main(String[] args) {
			Scanner f = new Scanner(System.in);
			System.out.print("Enter a sentence: ");
			String e = f.nextLine();
			int l = e.length();
			System.out.println("Sentence length: " + l);
			
			if (l < 20) System.out.println("Short sentence");
			else if (l <= 50) System.out.println("Medium sentence");
			else System.out.println("Long sentence");
	} 
}
