package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoan() {
		return loanLimit;
	}

	public void setLoan(Double loan) {
		this.loanLimit = loan;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
}
