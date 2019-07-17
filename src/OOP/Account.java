package OOP;

public class Account {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setArmorSchedule();
		la.setTerm(20);
		
		// Polymorphism changes where IRate is pointing
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
	}

}
