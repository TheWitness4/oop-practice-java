package OOP;

public class BankAccount implements IRate {
	// Define variables
	String accountNumber;
	
	// Static belongs to class, not object
	// final makes it immutable - similar to const
	private static final String routingNumber = "045671";

	
	// Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	// Constructor definitions
		// 1. Used to define properties of object
		// 2. Implicitly called upon instantiation
		// 3. Same name as class itself
		// 4. NO return type
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		// InitDeposit, accountType and Msg are local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("Initial deposit of: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1000";
		} else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	//Getters / Setters
	
	// Allow user to define 'name', not variable
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("Set Rate: ");
	}
	public void increaseRate() {
		System.out.println("Increase rate to: ");
	}
	
	// Define methods
	public void deposit(double amount) { //Public is allowed access anywhere in project
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) { //Default modifier is allowed access anywhere in package
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	//Only accessible in class
	// Private can only be called from within class
	private void showActivity(String activity) { 
		System.out.println("TRANSACTION TYPE: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	void getStatus() {
		
	}
	
	//Override base toString() method
	public String toString() {
		return "[ NAME:" + name + ". ACCOUNT NUMBER " + accountNumber + ". ROUTING NUMBER " + routingNumber + ". BALANCE: $" + balance + " ]";
	}
}
