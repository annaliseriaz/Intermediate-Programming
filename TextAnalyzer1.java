package intermediateprogramming;
import java.util.Scanner;
public class TextAnalyzer1 {

	public static void main(String[] args) {
		//Character Array Analysis (toCharArray())
		Scanner z = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String s = z.nextLine();
		char[] a = s.toCharArray();
		int vowel = 0;
		
		for (char o : a) {
			if ("AEIOUaeiou".indexOf(o) != -1) vowel++;
		}
		System.out.println("Total vowels: " + vowel);
		z.close();
	}
}
