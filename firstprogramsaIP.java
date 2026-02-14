package intermediateprogramming;
import java.util.Scanner;
public class FirstProgramsaIP {

	public static void main(String[] args) {
		System.out.print("Hello World!");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name: ");
		String username = sc.nextLine();
		System.out.println("Your name is " + username);
		
		addingNum();
	}
	
	public static void addingNum() {
		int a = 5;
		int b = 6;
		int sum = a + b;
		System.out.println("\nThe sum is " + sum);
	}
}
