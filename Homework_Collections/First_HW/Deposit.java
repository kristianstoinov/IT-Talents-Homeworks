

public class Deposit extends BankProduct {

	
	private int monthlyPayDeposit;
	

	public Deposit(String name, double yearlyInterest, int productPeriod) {
		super(name, yearlyInterest, productPeriod);
		this.setType("Deposit");
		
		
	}
	
	int getMonthlyPayDeposit() {
		this.monthlyPayDeposit=(int) ((this.getCurrentMoney()*this.getYearlyInterest())/12);
		return monthlyPayDeposit;
	}

	void setMonthlyPayDeposit(int monthlyPayDeposit) {
		this.monthlyPayDeposit = monthlyPayDeposit;
	}


}
