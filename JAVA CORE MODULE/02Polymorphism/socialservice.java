package Polymorphism02;

public class socialservice {
	
	String servicename;
	String location;
	int emgcontact;
	
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getEmgcontact() {
		return emgcontact;
	}
	public void setEmgcontact(int emgcontact) {
		this.emgcontact = emgcontact;
	}
	
	void respond() {
		System.out.println("informing emergency to services");
	}
	
	public socialservice() {
		
		this.servicename = "public safety dept";
		this.location = "pune";
		this.emgcontact = 101;
	}
	
	public socialservice(String servicename, String location, int emgcontact) {
	
		this.servicename = servicename;
		this.location = location;
		this.emgcontact = emgcontact;
	}
	
	void display() {
		System.out.println("service name: "+this.servicename);
		System.out.println("location: "+this.location);
		System.out.println("emergency contact: "+this.emgcontact);
	}
	

}// social service ends

class firebrigade extends socialservice{
	int nooftrucks;
	int nooffirefighters;
	
	public int getNooftrucks() {
		return nooftrucks;
	}
	public void setNooftrucks(int nooftrucks) {
		this.nooftrucks = nooftrucks;
	}
	public int getNooffirefighters() {
		return nooffirefighters;
	}
	public void setNooffirefighters(int nooffirefighters) {
		this.nooffirefighters = nooffirefighters;
	}
	
	void respond() {
		System.out.println("be ready with water ");
	}
	
	public firebrigade() {
		super();
		this.nooftrucks = 5;
		this.nooffirefighters = 20;
	}
	
	
	public firebrigade(String servicename, String location, int emgcontact,int nooftrucks, int nooffirefighters) {
		super(servicename,location,emgcontact);
		this.nooftrucks = nooftrucks;
		this.nooffirefighters = nooffirefighters;
	}
	
	void display() {
		super.display();
		System.out.println("no of trucks avail: "+this.nooftrucks);
		System.out.println("no of fire fighters: "+this.nooffirefighters);
	}
	
}// class firebrigade ends

class policestaion extends socialservice{
	
	 int noofofficers;
	 int noofpolicecar;
	 
	public int getNoofofficers() {
		return noofofficers;
	}
	public void setNoofofficers(int noofofficers) {
		this.noofofficers = noofofficers;
	}
	public int getNoofpolicecar() {
		return noofpolicecar;
	}
	public void setNoofpolicecar(int noofpolicecar) {
		this.noofpolicecar = noofpolicecar;
	}
	
	void respond() {
		System.out.println("be ready with constables ");
	}
	
	public policestaion() {
		super();
		this.noofofficers = 20;
		this.noofpolicecar = 30;
	}
	public policestaion(String servicename, String location, int emgcontact,int noofofficers, int noofpolicecar) {
		super(servicename,location,emgcontact);
		this.noofofficers = noofofficers;
		this.noofpolicecar = noofpolicecar;
	}
	  
	void display() {
		super.display();
		System.out.println("no of officers are: "+this.noofofficers);
		System.out.println("no of cars are: "+this.noofpolicecar);
	}
	 
	
}// police station ends

class Govthospital extends socialservice{
	int noofdoctore;
	int ambulance;
	
	public int getNoofdoctore() {
		return noofdoctore;
	}
	public void setNoofdoctore(int noofdoctore) {
		this.noofdoctore = noofdoctore;
	}
	public int getAmbulance() {
		return ambulance;
	}
	public void setAmbulance(int ambulance) {
		this.ambulance = ambulance;
	}
	
	void respond() {
		System.out.println("be ready with nurse ");
	}
	
	public Govthospital() {
		super();
		this.noofdoctore = 5;
		this.ambulance = 6;
	}
	
	public Govthospital(String servicename, String location, int emgcontact,int noofdoctore, int ambulance) {
		super(servicename,location,emgcontact);
		this.noofdoctore = noofdoctore;
		this.ambulance = ambulance;
	}
	
	void display() {
		super.display();
		System.out.println("no of doctors are: "+this.noofdoctore);
		System.out.println("ambulance availaible: "+this.ambulance);
	}
	
	
}// hospital ends

class Testsocialservice{
	public static void main(String args[]) {
		socialservice s1=new socialservice();
		
		firebrigade f1=new firebrigade();
		
		policestaion p1=new policestaion();
		
		Govthospital g1=new Govthospital();
		
		s1=new firebrigade("modi sefty service","Mumbai",102,25,20);
		s1.display();
		
		
		s1.respond();
		f1.respond();
		
		
		
		
	}
}
