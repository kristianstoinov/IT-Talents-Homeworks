package First_HW;

import java.util.ArrayList;

public class Bank {
	private String name;
	private String address;
	private ArrayList<BankProduct> bankProducts;
	private int bankReserve;
	private ArrayList<Client> theClientsOfTheBank;

	public Bank(String name, String address, int bankReserve,
			ArrayList<BankProduct> bankProducts) {
		if (name != null) {
			if (bankReserve > 0) {
				this.name = name;
				this.address = address;
				this.bankReserve = bankReserve;
				this.bankProducts = bankProducts;
			}
		} else {
			this.name = "Invalid bank,duuude";
		}
	}

	public void receiveDeposit(int sum) {
		this.setBankReserve(((this.getBankReserve()) + ((9 / 10) * sum)));
	}

	public void payInterestOfDeposits() {
		for (BankProduct deposits : this.getBankProducts()) {
			if (deposits.getType().equals("Deposit")) {
				this.calculateInterestOfDeposit((Deposit) deposits);
			}
		}
	}

	public boolean grantCredit(int sum, int period, Client client) {
		int paymentsForAllCreditsMonthly = 0;
		if (client.getListOfCredits() != null) {
			for (Credit credits : client.getListOfCredits()) {

				if (credits.getType().equals("Credit")) {
					paymentsForAllCreditsMonthly += credits
							.getMonthlyReturnMoney();
				}

			}
		} else {
			ArrayList<Credit> listOfCredits = new ArrayList<Credit>();
			client.setListOfCredits(listOfCredits);
			for (Credit credits : client.getListOfCredits()) {

				if (credits.getType().equals("Credit")) {
					paymentsForAllCreditsMonthly += credits
							.getMonthlyReturnMoney();
				}
			}
		}
		if ((paymentsForAllCreditsMonthly > (client.getSalary() * (5 / 10)))
				&& (sum > this.getBankReserve())) {
			System.out.println("Sorry , we can't grant you this credit");
			return false;
		} else {
			System.out.println("Credit granted!");
			this.setBankReserve(this.getBankReserve() - sum);
			return true;

		}

	}

	public void calculateInterestOfDeposit(Deposit deposit) {
		deposit.setCurrentMoney(deposit.getCurrentMoney()
				+ (deposit.getYearlyInterest() * deposit.getCurrentMoney()));
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

	ArrayList<BankProduct> getBankProducts() {
		return bankProducts;
	}

	void setBankProducts(ArrayList<BankProduct> bankProducts) {
		this.bankProducts = bankProducts;
	}

	int getBankReserve() {
		return bankReserve;
	}

	void setBankReserve(int bankReserve) {
		this.bankReserve = bankReserve;
	}

	ArrayList<Client> getTheClientsOfTheBank() {
		return theClientsOfTheBank;
	}

	void setTheClientsOfTheBank(ArrayList<Client> theClientsOfTheBank) {
		this.theClientsOfTheBank = theClientsOfTheBank;
	}

}
