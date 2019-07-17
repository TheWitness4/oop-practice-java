package lab;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("123456789", 1000);
		BankAccount acc2 = new BankAccount("987654321", 2000);
		BankAccount acc3 = new BankAccount("135276489", 3000);
		
		acc1.setName("Jack");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}


class BankAccount implements IInterest{
	// Properties of bank account
	private static int ID = 1000;	// Internal ID - stays with class, not object
	private String accountNumber;	// ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005400657"; 
	private String name;
	private String SSN;
	private double balance;
	
	// Constructors
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void payBill(double amount) {
		balance = balance-amount;
		System.out.println("Bill paid: " + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		System.out.println("Deposited: " + amount);
		balance = balance+amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	public void accrueInterest() {
		
	}
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: "+routingNumber+"]\n[Balance: " + balance + "]";
	}
	
}