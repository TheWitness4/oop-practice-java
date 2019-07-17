package OOP;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase rate");
	}
	
	public void setTerm(int term) {
		System.out.println("Settint term to: " + term + " years.");
	}
	
	public void setArmorSchedule() {
		System.out.println("Amortization schedule");
	}

}
