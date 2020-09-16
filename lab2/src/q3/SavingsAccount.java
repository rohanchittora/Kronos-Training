package q3;

class SavingsAccount extends Account {
	private double interest = 5;
	private double maxWithdraw;

	public SavingsAccount(String memberName, double maxWithdraw, double initialBalance) {
		super(memberName, initialBalance);
		this.maxWithdraw = maxWithdraw;
	}
	
	public double getBalance() {
		return this.getAccountBalance() + interest*this.getAccountBalance();
	}

	public void withdraw(double money) {
		if (money <= maxWithdraw && this.getAccountBalance() - money >= 500)
			this.setAccountBalance(this.getAccountBalance() - money);
	}
}
