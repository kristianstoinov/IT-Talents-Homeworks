

public abstract class BankProduct {

	protected String name;
	protected String type;
	protected double yearlyInterest;
	protected int productPeriod;
	protected double currentMoney;
	protected Client productClient;
	
	
	public BankProduct(String name,double yearlyInterest,int productPeriod){
		if(name!=null){
			if(yearlyInterest>0){
				if(productPeriod>=1 && productPeriod<=60){
				this.name=name;
				this.yearlyInterest=yearlyInterest;
				this.productPeriod=productPeriod;
				}
			}
		}else{
			this.name="Invalid product";
		}
		
		
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		if(name!=null)
		this.name = name;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		if(type!=null)
		this.type = type;
	}
	double getYearlyInterest() {
		return yearlyInterest;
	}
	void setYearlyInterest(double yearlyInterest) {
		this.yearlyInterest = yearlyInterest;
	}
	int getProductPeriod() {
		return productPeriod;
	}
	void setProductPeriod(int productPeriod) {
		this.productPeriod = productPeriod;
	}
	double getCurrentMoney() {
		return currentMoney;
	}
	void setCurrentMoney(double currentMoney) {
		this.currentMoney = currentMoney;
	}
	Client getProductClient() {
		return productClient;
	}

	void setProductClient(Client productClient) {
		if(productClient!=null)
		this.productClient = productClient;
	}

	
}
