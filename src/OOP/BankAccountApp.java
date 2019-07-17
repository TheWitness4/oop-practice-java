package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		// Create new bank account >> instantiate object
		BankAccount acc1 = new BankAccount();
		
		acc1.accountNumber = "0123897";
		//acc1.name = "John Doe";
		acc1.setName("John Doe");
		System.out.println(acc1.getName());
		acc1.setSsn("123456789");
		System.out.println("SSN: " + acc1.getSsn());
		
		
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.withdraw(200);
		acc1.deposit(700);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString()); 
		// Will display routingNumber variable privately defined
		
		// Polymorphism through Overloading 
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0123897";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "0123897";
		acc3.checkBalance();
		
		
		/*
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5"; //BankAccount class cannot access CDAccount child properties
		cd1.name = "Jane";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		*/
	}

}
