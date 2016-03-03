

public class Credit extends BankProduct {

	private int monthlyReturnMoney;


	public Credit(String name, double yearlyInterest, int productPeriod) {
		super(name, yearlyInterest, productPeriod);
		this.setType("Credit");
	}

	int getMonthlyReturnMoney() {
		this.monthlyReturnMoney= (int) ((this.getCurrentMoney()*this.getYearlyInterest())/12);
		return monthlyReturnMoney;
	}


	void setMonthlyReturnMoney(int monthlyReturnMoney) {
		this.monthlyReturnMoney = monthlyReturnMoney;
	}

	
	
	
}
