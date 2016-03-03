

import java.util.ArrayList;

public class Client {

	private String name;
	private String address;
	private double cash;
	private int salary;
	private ArrayList<Deposit> listOfDeposits;
	private ArrayList<Credit> listOfCredits;
	private Bank myBank;

	public Client(String name,int cash, int salary) {
		if (name != null) {
			if (salary > 0) {
				this.name = name;
				this.cash = cash;
				this.salary = salary;
			}
		} else {
			this.name = "Mincho_we";
		}

	}

	public void makeDeposit(double currentSumOfDeposit, int period, BankProduct deposit) {
		if(deposit!=null){
		if (currentSumOfDeposit > 0) {
			if (period >= 1 && period <= 60) {
				if (this.getCash() > 0) {
					this.setCash(this.getCash() - currentSumOfDeposit);
					if(this.getListOfDeposits()!=null){
					this.getListOfDeposits().add((Deposit) deposit);
					}else{
						ArrayList<Deposit> listOfDeposits=new ArrayList<Deposit>();
						this.setListOfDeposits(listOfDeposits);
						this.getListOfDeposits().add((Deposit) deposit);
					}
					this.getMyBank().getBankProducts().add(deposit);
					deposit.setProductPeriod(period);
					deposit.setCurrentMoney(currentSumOfDeposit);
					System.out
							.println("You have successfully created a deposit");
//+Money.recieveDeposit
				}
			}
		}
		}
	}

	public void requestCredit(int sum, int period, Credit credit) {
		if(credit!=null){
		if (sum > 0) {
			if (period >= 1 && period <= 60) {
				if (this.getMyBank().grantCredit(sum, period, this) == true) {
					System.out.println("The bank has granted " + this.getName() + " a credit!");
					this.setCash(getCash() + sum);
					//+Bank.grantCredit
					this.getListOfCredits().add(credit);
					this.getMyBank().getBankProducts().add(credit);
					credit.setProductPeriod(period);
					credit.setCurrentMoney(sum);
				}else{
					return;
				}

			}
		}
		}
	}

	public void returnCredit(int sum, Credit credit) {
		if(credit!=null){
		credit.setCurrentMoney(credit.getCurrentMoney() - sum);
		System.out.println("Money left to pay this credit: "
				+ credit.getCurrentMoney());
		}
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		if(name!=null)
		this.name = name;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		if(address!=null)
		this.address = address;
	}

	double getCash() {
		return this.cash;
	}

	void setCash(double d) {
		this.cash = d;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	ArrayList<Deposit> getListOfDeposits() {
		return listOfDeposits;
	}

	ArrayList<Credit> getListOfCredits() {
		return listOfCredits;
	}

	Bank getMyBank() {
		return myBank;
	}

	void setMyBank(Bank myBank) {
		if(myBank!=null)
		this.myBank = myBank;
	}
	void setListOfDeposits(ArrayList<Deposit> listOfDeposits) {
		this.listOfDeposits = listOfDeposits;
	}

	void setListOfCredits(ArrayList<Credit> listOfCredits) {
		this.listOfCredits = listOfCredits;
	}

}
