package intermediateprogramming;
import java.util.Scanner;
public class TextAnalyzer4 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sen = n.nextLine();
		String rev = new StringBuilder(sen).reverse().toString();
		
		System.out.println("Newly reversed sentence: " + rev);
		n.close();
	}
}
