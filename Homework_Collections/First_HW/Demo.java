

import java.util.ArrayList;




public class Demo {
	private static final int PERIOD = 32;
	private static final double DEPOSIT_RANDOMIZER = ((double)(Math.random() * (1 - 0.8) + 0.8));
	
	
public static void main(String[] args) {
	
	ArrayList<BankProduct> bankProducts=new ArrayList<BankProduct>();
	Bank bnb=new Bank("BNB", "Sofia",2000000,bankProducts);
	
	Deposit shortDeposit=new Deposit("Short Deposit", 3.00, 3);
	Deposit shortDeposit1=new Deposit("Short Deposit1", 3.00, 3);
	Deposit shortDeposit2=new Deposit("Short Deposit2", 3.00, 3);
	Deposit shortDeposit3=new Deposit("Short Deposit3", 3.00, 3);
	
	
	Deposit longDeposit=new Deposit("Long Deposit", 5.00, 12);
	Deposit longDeposit1=new Deposit("Long Deposit1", 5.00, 12);
	Deposit longDeposit2=new Deposit("Long Deposit2", 5.00, 12);
	Deposit longDeposit3=new Deposit("Long Deposit3", 5.00, 12);
	Deposit longDeposit4=new Deposit("Long Deposit4", 5.00, 12);
	Deposit longDeposit5=new Deposit("Long Deposit5", 5.00, 12);
	
	Credit homeCredit = new Credit("Home Credit",6.00, 36);
	Credit homeCredit1 = new Credit("Home Credit1",6.00, 36);
	Credit homeCredit2 = new Credit("Home Credit2",6.00, 36);
	Credit homeCredit3 = new Credit("Home Credit3",6.00, 36);
	Credit homeCredit4 = new Credit("Home Credit4",6.00, 36);
	
	Credit consumerCredit=new Credit("Consumer Credit", 10.00, 36);
	Credit consumerCredit1=new Credit("Consumer Credit1", 10.00, 36);
	Credit consumerCredit2=new Credit("Consumer Credit2", 10.00, 36);
	Credit consumerCredit3=new Credit("Consumer Credit3", 10.00, 36);
	Credit consumerCredit4=new Credit("Consumer Credit4", 10.00, 36);
	
//adding products to the bank
	
	bnb.getBankProducts().add(shortDeposit);
	bnb.getBankProducts().add(shortDeposit1);
	bnb.getBankProducts().add(shortDeposit2);
	bnb.getBankProducts().add(shortDeposit3);
	
	bnb.getBankProducts().add(longDeposit);
	bnb.getBankProducts().add(longDeposit1);
	bnb.getBankProducts().add(longDeposit2);
	bnb.getBankProducts().add(longDeposit3);
	bnb.getBankProducts().add(longDeposit4);
	bnb.getBankProducts().add(longDeposit5);
	
	
	bnb.getBankProducts().add(homeCredit);
	bnb.getBankProducts().add(homeCredit1);
	bnb.getBankProducts().add(homeCredit2);
	bnb.getBankProducts().add(homeCredit3);
	bnb.getBankProducts().add(homeCredit4);
	
	bnb.getBankProducts().add(consumerCredit);
	bnb.getBankProducts().add(consumerCredit1);
	bnb.getBankProducts().add(consumerCredit2);
	bnb.getBankProducts().add(consumerCredit3);
	bnb.getBankProducts().add(consumerCredit4);
	
	
	
	
	
	Client[] clients=new Client[10];
	
	Client pena=new Client("Pena", 60000, 3000);
	Client minka=new Client("Minka", 20000, 2000);
	Client petio=new Client("Petio", 10000, 5000);
	Client ivan=new Client("Ivan", 100000, 1500);
	Client kris=new Client("Chris", 200000, 5000);
	Client mitko=new Client("Mitko", 100000, 3000);
	Client stamat=new Client("Stamat", 200000, 5000);
	Client spas=new Client("Spas", 30000, 3000);
	Client minio=new Client("Minio", 40000, 5000);
	Client penio=new Client("Penio", 3000, 2000);
	
	
	clients[0]=pena;
	clients[1]=minka;
	clients[2]=petio;
	clients[3]=ivan;
	clients[4]=kris;
	clients[5]=mitko;
	clients[6]=stamat;
	clients[7]=spas;
	clients[8]=minio;
	clients[9]=penio;
	
for(int i=0;i<clients.length;i++){
	clients[i].setMyBank(bnb);
}
	
	//List of Deposits
 clientMakesDeposit(pena, longDeposit, bnb);
 clientMakesDeposit(minka, longDeposit1, bnb);
 clientMakesDeposit(petio, longDeposit2, bnb);
 clientMakesDeposit(ivan, shortDeposit, bnb);
 clientMakesDeposit(kris, longDeposit3, bnb);
 clientMakesDeposit(stamat, longDeposit4, bnb);
 clientMakesDeposit(mitko, shortDeposit1, bnb);
 clientMakesDeposit(spas, shortDeposit, bnb);
 clientMakesDeposit(minio, shortDeposit, bnb);
 clientMakesDeposit(penio, longDeposit5, bnb);
 

	
	System.out.println("The bank reserve of BNB is : "  + bnb.getBankReserve());
	
	
	clientRequestsCredit(10000, 32, homeCredit, pena, bnb);
	clientRequestsCredit(10000, 32, homeCredit1, minka, bnb);
	clientRequestsCredit(10000, 32, homeCredit2, petio, bnb);
	clientRequestsCredit(10000, 32, homeCredit3, ivan, bnb);
	clientRequestsCredit(10000, 32, homeCredit4, kris, bnb);
	clientRequestsCredit(10000, 32, consumerCredit, mitko, bnb);
	clientRequestsCredit(10000, 32, consumerCredit1, stamat, bnb);
	clientRequestsCredit(10000, 32, consumerCredit2, spas, bnb);
	clientRequestsCredit(10000, 32, consumerCredit3, minio, bnb);
	clientRequestsCredit(10000, 32, consumerCredit4, penio, bnb);
	
	System.out.println("The bank reserve of BNB is : "  + bnb.getBankReserve());
	
}
public static void clientMakesDeposit(Client client,BankProduct deposit,Bank bank){
	
	double currentSumOfDeposit=((double)client.getCash()*DEPOSIT_RANDOMIZER);
	client.makeDeposit((double)currentSumOfDeposit, PERIOD, deposit);
	bank.receiveDeposit((double)currentSumOfDeposit);
	
}

public static void clientRequestsCredit(int sum,int period,Credit credit,Client client,Bank bank){
	client.requestCredit(sum, period, credit);
	bank.grantCredit(sum, period, client);
}

}
