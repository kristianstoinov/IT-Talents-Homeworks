package First_HW;

import java.util.ArrayList;

public class Demo {
public static void main(String[] args) {
	ArrayList<BankProduct> bankProducts=new ArrayList<BankProduct>();
	
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
	
	
	
	
	Bank bnb=new Bank("BNB", "Sofia",2000000,bankProducts);
	
	
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
	bnb.receiveDeposit((8/10)*(pena.getCash()));
	pena.makeDeposit((8/10)*(pena.getCash()), 32, longDeposit);
	
	bnb.receiveDeposit((8/10)*(minka.getCash()));
	minka.makeDeposit((8/10)*(minka.getCash()), 32, longDeposit1);

	bnb.receiveDeposit((9/10)*petio.getCash());
	petio.makeDeposit((9/10)*petio.getCash(), 32, longDeposit2);
	
	bnb.receiveDeposit(ivan.getCash());
	ivan.makeDeposit(ivan.getCash(), 32, shortDeposit);
	
	bnb.receiveDeposit((8/10)*kris.getCash());
	kris.makeDeposit((8/10)*kris.getCash(), 32, longDeposit3);
	
	bnb.receiveDeposit(mitko.getCash());
	mitko.makeDeposit(mitko.getCash(), 32, shortDeposit1);
	
	bnb.receiveDeposit((9/10)*stamat.getCash());
	stamat.makeDeposit((9/10)*stamat.getCash(), 32, longDeposit4);
	
	bnb.receiveDeposit(spas.getCash());
	spas.makeDeposit(spas.getCash(), 32, shortDeposit2);
	
	bnb.receiveDeposit((8/10)*minio.getCash());
	minio.makeDeposit((8/10)*minio.getCash(), 32, shortDeposit3);
	
	bnb.receiveDeposit(penio.getCash());
	penio.makeDeposit(penio.getCash(), 32, longDeposit5);
	

	
	System.out.println("The bank reserve of BNB is : "  + bnb.getBankReserve());
	
	
	//List of Credits
	pena.requestCredit(10000, 32, homeCredit);
	bnb.grantCredit(10000, 32, pena);
	
	minka.requestCredit(10000, 32, homeCredit1);
	bnb.grantCredit(10000, 32, minka);
	
	petio.requestCredit(10000, 32, homeCredit2);
	bnb.grantCredit(10000, 32, petio);
	
	ivan.requestCredit(10000, 32, homeCredit3);
	bnb.grantCredit(10000, 32, ivan);
	
	kris.requestCredit(10000, 32, homeCredit4);
	bnb.grantCredit(10000, 32, kris);
	
	mitko.requestCredit(10000, 32, consumerCredit);
	bnb.grantCredit(10000, 32, mitko);
	
	stamat.requestCredit(10000, 32, consumerCredit1);
	bnb.grantCredit(10000, 32, stamat);
	
	
	spas.requestCredit(10000, 32, consumerCredit2);
	bnb.grantCredit(10000, 32, spas);
	
	minio.requestCredit(10000, 32, consumerCredit3);
	bnb.grantCredit(10000, 32, minio);
	
	penio.requestCredit(10000, 32, consumerCredit4);
	bnb.grantCredit(10000, 32, penio);
	
	
	
}
}
