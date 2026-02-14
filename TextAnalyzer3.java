package intermediateprogramming;
import java.util.Scanner;
public class TextAnalyzer3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String se = scan.nextLine();
		
		System.out.print("Enter the word to replace: ");
		String nt = scan.next();
		
		System.out.print("Enter the new word: ");
		String nW = scan.next();
		
		String ms = se.replaceAll(nt, nW);
		System.out.println("Newly replaced sentence: " + ms);
		scan.close(); 
	}
}
