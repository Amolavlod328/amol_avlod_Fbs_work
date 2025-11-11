package inheritance01;

public class Payment {
	double amount;
	String paymentDate;
	String recieverName;
	String paymentMethod;
	
	Payment(){
		this.amount=00;
		this.paymentDate="null";
		this.recieverName="null";
		this.paymentMethod="null";
		
	}
	Payment(double a,String pd,String rn,String pm){
		this.amount=a;
		this.paymentDate=pd;
		this.recieverName=rn;
		this.paymentMethod=pm;
		
	}//constructors ends here
	void display() {
		System.out.println("Amout is : "+this.amount);
		System.out.println("PaymentDate is : "+this.paymentDate);
		System.out.println("reciver name is : "+this.recieverName);
		System.out.println("Payment Method is : "+this.paymentMethod);
	}
	double getAmount() {
		return amount;
	}
	String getPaymentDate() {
		return paymentDate;
	}
	String getPaymentMethod() {
		return paymentMethod;
	}
	String getRecieverName() {
		return recieverName;
	}
	void setAmount(double amount) {
		this.amount = amount;
	}
	
	void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	// Getters And Setters Ends here
	
	void setRecieverName(String recieverName) {
		this.recieverName = recieverName;
	}
	
	
	

}// class Payment ends here

class CreditCard extends Payment{
	int cardNo;
	int CVV;
	int getCardNo() {
		return cardNo;
	}
	void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	int getCVV() {
		return CVV;
	}
	void setCVV(int cVV) {
		CVV = cVV;
	}// getters and setters ends here
	
	CreditCard(){
		super();
		this.cardNo=00;
		this.CVV=00;
	}
	
	CreditCard(double a,String pd,String rn,String pm,int cn,int cv){
		super(a,pd,rn,pm);
		this.cardNo=cn;
		this.CVV=cv;
	}//constructors ends here
	
	void display() {
		super.display();
		System.out.println("Card no is :" + this.cardNo);
		System.out.println("CVV is :" + this.CVV);
	}
	
	
	
	
}

class UpiPayment extends Payment{
	String upiId;
	int upiPin;
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	public int getUpiPin() {
		return upiPin;
	}
	public void setUpiPin(int upiPin) {
		this.upiPin = upiPin;
	}// getters and setters ends here
	
	UpiPayment(){
		super();
		this.upiId="Null";
		this.upiPin=00;
	}
	
	UpiPayment(double a,String pd,String rn,String pm,String cn,int cv){
		super(a,pd,rn,pm);
		this.upiId=cn;
		this.upiPin=cv;
	}//constructors ends here
	
	void display() {
		super.display();
		System.out.println("UPI ID  : " + this.upiId);
		System.out.println("UPI PIN : " + this.upiPin);
	}
	
	
	
}

class TestPayment{
	public static void main(String[] args) {
		
	CreditCard c1= new CreditCard(1233.76,"11-NOV-2025","Virat KOhli","CreditCard",123445,29);
	c1.display();
	UpiPayment u1= new UpiPayment(1233.76,"11-NOV-2025","AB Devilliers","UPI","AB@upi",2954);
	u1.display();
	}
}

