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
	
	public Double getLoandLimit() {
		return loanLimit;
	}

	public void setLoandLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10;
		}
	}
	

}
