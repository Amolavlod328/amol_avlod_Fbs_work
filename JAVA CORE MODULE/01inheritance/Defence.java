package inheritance01;

public class Defence {
	 
	 String nameofhead;
	 int nooftroops;
	 int noofmission;
	 int noofcasual;
	 int noofdept;
	 int budget;
	 int noofvehicle;
	 String lochead;
	 String country;
	 int manpower;
	 
	public String getNameofhead() {
		return nameofhead;
	}
	public void setNameofhead(String nameofhead) {
		this.nameofhead = nameofhead;
	}
	public int getNooftroops() {
		return nooftroops;
	}
	public void setNooftroops(int nooftroops) {
		this.nooftroops = nooftroops;
	}
	public int getNoofmission() {
		return noofmission;
	}
	public void setNoofmission(int noofmission) {
		this.noofmission = noofmission;
	}
	public int getNoofcasual() {
		return noofcasual;
	}
	public void setNoofcasual(int noofcasual) {
		this.noofcasual = noofcasual;
	}
	public int getNoofdept() {
		return noofdept;
	}
	public void setNoofdept(int noofdept) {
		this.noofdept = noofdept;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getNoofvehicle() {
		return noofvehicle;
	}
	public void setNoofvehicle(int noofvehicle) {
		this.noofvehicle = noofvehicle;
	}
	public String getLochead() {
		return lochead;
	}
	public void setLochead(String lochead) {
		this.lochead = lochead;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getManpower() {
		return manpower;
	}
	public void setManpower(int manpower) {
		this.manpower = manpower;
	}
	
	
	public Defence() {
		
		this.nameofhead = "kashmir";
		this.nooftroops = 50;
		this.noofmission = 10;
		this.noofcasual = 15;
		this.noofdept = 20;
		this.budget = 5000;
		this.noofvehicle = 30;
		this.lochead = "jammu";
		this.country = "india";
		this.manpower = 50;
	}
	
	public Defence(String nameofhead, int nooftroops, int noofmission, int noofcasual, int noofdept, int budget,
			int noofvehicle, String lochead, String country, int manpower) {
		
		this.nameofhead = nameofhead;
		this.nooftroops = nooftroops;
		this.noofmission = noofmission;
		this.noofcasual = noofcasual;
		this.noofdept = noofdept;
		this.budget = budget;
		this.noofvehicle = noofvehicle;
		this.lochead = lochead;
		this.country = country;
		this.manpower = manpower;
	}
	
	void display() {
		System.out.println("name of head: "+this.nameofhead);
		System.out.println("no of troops: "+this.nooftroops);
		System.out.println("no of mission: "+this.noofmission);
		System.out.println("no of cassualties: "+this.noofcasual);
		System.out.println("no of dept: "+this.noofdept);
		System.out.println("budget: "+this.budget);
		System.out.println("no of vehicle: "+this.noofvehicle);
		System.out.println("location head: "+this.lochead);
		System.out.println("country: "+this.country);
		System.out.println("manpower: "+this.manpower);
		
	}

} // defence class ends here

class Army extends Defence{
	  int nooftank;
	  int noofguns;
	  int noofgranade;
	  int nooffaculation;
	  
	  
	public int getNooftank() {
		return nooftank;
	}
	public void setNooftank(int nooftank) {
		this.nooftank = nooftank;
	}
	public int getNoofguns() {
		return noofguns;
	}
	public void setNoofguns(int noofguns) {
		this.noofguns = noofguns;
	}
	public int getNoofgranade() {
		return noofgranade;
	}
	public void setNoofgranade(int noofgranade) {
		this.noofgranade = noofgranade;
	}
	public int getNooffaculation() {
		return nooffaculation;
	}
	public void setNooffaculation(int nooffaculation) {
		this.nooffaculation = nooffaculation;
	}
	
	

	public Army() {
		super();
		this.nooftank = 50;
		this.noofguns = 40;
		this.noofgranade = 45;
		this.nooffaculation =20;
	}
	
	
	
	public Army(String nameofhead, int nooftroops, int noofmission, int noofcasual, int noofdept, int budget,
			int noofvehicle, String lochead, String country, int manpower,int nooftank, int noofguns, int noofgranade, int nooffaculation) {
		
		
		super(nameofhead,nooftroops,noofmission,noofcasual,noofdept,budget,noofvehicle,lochead,country,manpower);
		
		this.nooftank = nooftank;
		this.noofguns = noofguns;
		this.noofgranade = noofgranade;
		this.nooffaculation = nooffaculation;
	}
	 
	 void display() {
		 super.display();
		 System.out.println("noof tank: "+this.nooftank);
		 System.out.println("no of guns"+this.noofguns);
		 System.out.println("noofgranade"+this.noofgranade);
		 System.out.println("nooffaculation"+this.nooffaculation);
		 System.out.println("----------------------------------");
	 }
	
}// class army ends here

class neavi extends Defence{
	int noofship;
	int noofsubb;
	int nooftorpidos;
	
	public int getNoofship() {
		return noofship;
	}
	public void setNoofship(int noofship) {
		this.noofship = noofship;
	}
	public int getNoofsubb() {
		return noofsubb;
	}
	public void setNoofsubb(int noofsubb) {
		this.noofsubb = noofsubb;
	}
	public int getNooftorpidos() {
		return nooftorpidos;
	}
	public void setNooftorpidos(int nooftorpidos) {
		this.nooftorpidos = nooftorpidos;
	}
	
	public neavi() {
		super();
		this.noofship = 10;
		this.noofsubb = 5;
		this.nooftorpidos = 11;
	}
	
	
	public neavi(String nameofhead, int nooftroops, int noofmission, int noofcasual, int noofdept, int budget,
			int noofvehicle, String lochead, String country, int manpower,int noofship, int noofsubb, int nooftorpidos) {
		
		super(nameofhead,nooftroops,noofmission,noofcasual,noofdept,budget,noofvehicle,lochead,country,manpower);
		
		this.noofship = noofship;
		this.noofsubb = noofsubb;
		this.nooftorpidos = nooftorpidos;
	}
	
	
	void display() {
		super.display();
		System.out.println("no of ship: "+this.noofship);
		System.out.println("no of subbmarine"+this.noofsubb);
		System.out.println("no of troops: "+this.nooftorpidos);
		System.out.println("----------------------------------");
	}
	
	
}// neavi ends here

class Air extends Defence{
	int noofmissile;
	int noofaircraft;
	int noofsquadron;
	
	
	public int getNoofmissile() {
		return noofmissile;
	}
	public void setNoofmissile(int noofmissile) {
		this.noofmissile = noofmissile;
	}
	public int getNoofaircraft() {
		return noofaircraft;
	}
	public void setNoofaircraft(int noofaircraft) {
		this.noofaircraft = noofaircraft;
	}
	public int getNoofsquadron() {
		return noofsquadron;
	}
	public void setNoofsquadron(int noofsquadron) {
		this.noofsquadron = noofsquadron;
	}
	
	public Air() {
		super();
		this.noofmissile = 40;
		this.noofaircraft = 10;
		this.noofsquadron = 55;
	}
	public Air(String nameofhead, int nooftroops, int noofmission, int noofcasual, int noofdept, int budget,
			int noofvehicle, String lochead, String country, int manpower,int noofmissile, int noofaircraft, int noofsquadron) {
		
		super(nameofhead,nooftroops,noofmission,noofcasual,noofdept,budget,noofvehicle,lochead,country,manpower);
		
		this.noofmissile = noofmissile;
		this.noofaircraft = noofaircraft;
		this.noofsquadron = noofsquadron;
	}
	
	void display() {
		super.display();
		System.out.println("no of missilre: "+this.noofmissile);
		System.out.println("no of aircraft: "+this.noofaircraft);
		System.out.println("no of squadron"+this.noofsquadron);
		System.out.println("----------------------------------");
	}
	
}// Air ends here

class TestDefence{
	public static void main(String [] args) {
		
		Defence d1=new Defence();
		
		Army a1=new Army();
		
		neavi n1=new neavi();
		
		Air f1=new Air();
		
	     d1.display();
	     
	     a1.display();
	     
	     n1.display();
	     
	     f1.display();
		
	}
	
}
