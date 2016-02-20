package First_HW;

import java.util.ArrayList;

public class Client {

	private String name;
	private String address;
	private int cash;
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

	public void makeDeposit(int sum, int period, Deposit deposit) {
		if (sum > 0) {
			if (period >= 1 && period <= 60) {
				if (this.getCash() > 0) {
					this.setCash(getCash() - sum);
					if(deposit!=null){
						if(this.getListOfDeposits()!=null){
						this.getListOfDeposits().add(deposit);
						}else{
							ArrayList<Deposit> listOfDeposits=new ArrayList<Deposit>();
							this.setListOfDeposits(listOfDeposits);
							this.getListOfDeposits().add(deposit);
						}
					}else{
						System.out.println("Error");
					}
					
					this.getMyBank().getBankProducts().add(deposit);
					deposit.setProductPeriod(period);
					deposit.setCurrentMoney(sum);
					System.out
							.println("You have successfully created a deposit");
//+Money.recieveDeposit
				}else{
					System.out.println("Error1");
				}
			}else{
				System.out.println("Error2");
			}
		}else{
			System.out.println("Error3");
		}
	}

	public void requestCredit(int sum, int period, Credit credit) {
		if (sum > 0) {
			if (period >= 1 && period <= 60) {
				if (this.getMyBank().grantCredit(sum, period, this) == true) {
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

	public void returnCredit(int sum, Credit credit) {
		credit.setCurrentMoney(credit.getCurrentMoney() - sum);
		System.out.println("Money left to pay this credit: "
				+ credit.getCurrentMoney());
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	int getCash() {
		return cash;
	}

	void setCash(int cash) {
		this.cash = cash;
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
		this.myBank = myBank;
	}
	void setListOfDeposits(ArrayList<Deposit> listOfDeposits) {
		this.listOfDeposits = listOfDeposits;
	}

	void setListOfCredits(ArrayList<Credit> listOfCredits) {
		this.listOfCredits = listOfCredits;
	}

}
