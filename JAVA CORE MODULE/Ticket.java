package inheritance01;

public class Ticket {

	int ticketId;
	double ticketPrice;
	String seatNo;
	int getTicketId() {
		return ticketId;
	}
	void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	double getTicketPrice() {
		return ticketPrice;
	}
	void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	String getSeatNo() {
		return seatNo;
	}
	void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}//getters and setters ends here
	
	Ticket(){
		this.ticketId=00;
		this.ticketPrice=00;
		this.seatNo="Null";
		
	}
	
	Ticket(int i,double p,String s){
		this.ticketId=i;
		this.ticketPrice=p;
		this.seatNo=s;
		
	}//constructors ends here
	
	void display() {
		System.out.println("Ticket id :" +this.ticketId);
		System.out.println("Ticket Price :" +this.ticketPrice);
		System.out.println("Seat No :" +this.seatNo);
		
	}

}

class BusTicket extends Ticket{
	int busNo;

	int getBusNo() {
		return busNo;
	}

	void setBusNo(int busNo) {
		this.busNo = busNo;
	}//getters and setters ends here
	
	BusTicket(){
		super();
		busNo=00;
	}
	
	BusTicket(int ti,double p,String sn,int bn){
		super(ti,p,sn);
		busNo=bn;
	}
	
	void display(){
		System.out.println("----------------------------------");
		super.display();
		System.out.println("Bus no :"+this.busNo);
		System.out.println("----------------------------------");
	}
	
}//class bus ends here

class TrainTicket extends Ticket{
	int trainNo;
	String coachNO;
	
	int getTrainNo() {
		return trainNo;
	}
	void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	String getCoachNO() {
		return coachNO;
	}
	void setCoachNO(String coachNO) {
		this.coachNO = coachNO;
	}//getters and setter ends here
	
	TrainTicket(){
		super();
		this.trainNo=00;
		this.coachNO="Null";
	}
	
	TrainTicket(int ti,double p,String sn,int bn,String cn){
		super(ti,p,sn);
		trainNo=bn;
		this.coachNO=cn;
	}//constructors ends here
	
	void display(){
		System.out.println("----------------------------------");
		super.display();
		System.out.println("Train no :"+this.trainNo);
		System.out.println("Coach no :"+this.coachNO);
		System.out.println("----------------------------------");
	}
	
}//class TrainTicket ends here

class FlightTicket extends Ticket{
	int gateNo;

	int getGateNo() {
		return gateNo;
	}

	void setGateNo(int gateNo) {
		this.gateNo = gateNo;
	}//getters and setters ends here
	

	FlightTicket(){
		super();
		this.gateNo=00;
		
	}
	
	FlightTicket(int ti,double p,String sn,int bn){
		super(ti,p,sn);
		gateNo=bn;
	}//constructors ends here
	
	void display(){
		System.out.println("----------------------------------");
		super.display();
		System.out.println("Gate no :"+this.gateNo);
		System.out.println("----------------------------------");
	}
	
	
}

class TestTicket{
	public static void main(String[] args) {
		BusTicket b1= new BusTicket(101,2550.87,"36",123);
		b1.display();
		TrainTicket t1= new TrainTicket(101,2550.87,"32",123,"S2");
		t1.display();
		FlightTicket f1= new FlightTicket(101,2550.87,"GEN11",12);
		f1.display();
		
		
	}
}
