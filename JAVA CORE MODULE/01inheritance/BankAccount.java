package inheritance01;

public class BankAccount {
	int AccNo;
	String HName;
	String Barchname;
	
	// Default constructor
	
	BankAccount(){
		
		this.AccNo = 1234;
		this.HName = "shanky";
		this.Barchname = "Nanded";
	}

	// Parameterized Constructor
	
	BankAccount(int accNo, String hName, String barchname) {
		
		AccNo = accNo;
		HName = hName;
		Barchname = barchname;
	}
	
	// Getters And Setters

	int getAccNo() {
		return AccNo;
	}

	void setAccNo(int accNo) {
		AccNo = accNo;
	}

	String getHName() {
		return HName;
	}

	void setHName(String hName) {
		HName = hName;
	}

	String getBarchname() {
		return Barchname;
	}

	void setBarchname(String barchname) {
		Barchname = barchname;
	}
	
	// Display 
	
	void display() {
		
		System.out.println("AccNo is: "+this.AccNo);
		System.out.println("HName is: "+this.HName);
		System.out.println("Branch name: "+this.Barchname);
	}	
	
}

class SavingAcc extends BankAccount{
	
	static double interestRate = 7.5;
	double minBalance;
	int withdrawLimit;
	
	// Default constructor
	
	SavingAcc(){
		
		super();
		this.minBalance = 50000;
		this.withdrawLimit = 10;
	}

	// Parameterized Constructor
	
	public SavingAcc(int accNo,String hname,String Bname,double minBalance, int withdrawLimit) {
		
		super(accNo,hname,Bname);
		this.minBalance = minBalance;
		this.withdrawLimit = withdrawLimit;
	}
	
	// Getters And Setters

	double getMinBalance() {
		return minBalance;
	}

	void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	int getWithdrawLimit() {
		return withdrawLimit;
	}

	void setWithdrawLimit(int withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	double getinterestRate() {
		return interestRate;
	}
	
	static void setinterestRate(double newinterestRate) {
		interestRate = newinterestRate;
	}
	
	// Display 
	
	void display() {
		
		super.display();
		System.out.println("minBalance: "+this.minBalance);
		System.out.println("withdrawLimit:"+this.withdrawLimit);
		System.out.println("interestRate:"+this.interestRate);
		System.out.println("----------------------------------------");
	}
	
}// Seving Acc class ends here 

class currnetAcc extends BankAccount{
	
	String businessName;
	
	// Default constructor
	
	currnetAcc(){
		
		super();
		this.businessName = "poultry";
	}
	
	// Parameterized Constructor

	currnetAcc(int accNo, String hName, String barchname,String businessName) {
		
		super(accNo,hName,barchname);
		this.businessName = businessName;
	}

	// Getters And Setters
	
	String getBusinessName() {
		return businessName;
	}

	void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	// Display
	
	void display() {
		
		super.display();
		System.out.println("businessName: "+this.businessName);
	}
	
} //currentAcc ends here 


 class SourceBankAccount {

	public static void main(String[] args) {
		
		SavingAcc s1 = new SavingAcc();
		s1.display();
		
		currnetAcc c1 = new currnetAcc();
		c1.display();
		

	}

}


