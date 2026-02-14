import java.util.Scanner;

class Account {
	private double balance;
	
	
	public Account(double initialBalance) {
		if (initialBalance > 0.0)
			balance = initialBalance;
		else
			balance = 0.0;
	}
	
	public void displaymoney(double amount) {
		System.out.printf("\nsubtracting %.2f from account balance%n", amount);
		if (amount > balance) {
			System.out.println("Debit amount exceeded account balance.");
		}
		else {
			balance -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public static void main(String args[]) {	
		Scanner inputnumber = new Scanner(System.in);
		
		Account acc1 = new Account(150.00);
		Account acc2 = new Account(500.53);
		
		System.out.printf("account1 balance: $%.2f%n", acc1.getBalance());
		System.out.printf("account2 balance: $%.2f%n%n", acc2.getBalance());
		
		System.out.print("Enter withdrawal amount for account 1: ");
		double amount1 = inputnumber.nextDouble();
		acc1.displaymoney(amount1);
		System.out.printf("account1 balance: $%.2f%n", acc1.getBalance());
		System.out.printf("account2 balance: $%.2f%n", acc2.getBalance());
		
		System.out.print("\nEnter withdrawal amount for account 2: ");
		double amount2 = inputnumber.nextDouble();
		acc2.displaymoney(amount2);
		System.out.printf("account1 balance: $%.2f%n", acc1.getBalance());
		System.out.printf("account2 balance: $%.2f%n", acc2.getBalance());
		
		inputnumber.close();
	}
}
