package Polymorphism02;



public class Farmer {
	
		
		int farmerid;
		String fname;
		double landarea;
		String city;
		int anninc;
		int noofequip;
		int insuaram;
		
		
		public int getFarmerid() {
			return farmerid;
		}
		
		public void setFarmerid(int farmerid) {
			this.farmerid = farmerid;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public double getLandarea() {
			return landarea;
		}
		public void setLandarea(double landarea) {
			this.landarea = landarea;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getAnninc() {
			return anninc;
		}
		public void setAnninc(int anninc) {
			this.anninc = anninc;
		}
		public int getNoofequip() {
			return noofequip;
		}
		public void setNoofequip(int noofequip) {
			this.noofequip = noofequip;
		}
		public int getInsuaram() {
			return insuaram;
		}
		public void setInsuaram(int insuaram) {
			this.insuaram = insuaram;
		}
		
		void calsubcd(){
			System.out.println("Recieved subcd");
		}
		
		
		public Farmer() {
			
			this.farmerid = 101;
			this.fname ="Shrii";
			this.landarea =8.0 ;
			this.city = "Nanded";
			this.anninc = 5000;
			this.noofequip = 10;
			this.insuaram = 50000;
		}
		
		
	public Farmer(int farmerid, String fname, double landarea, String city, int anninc, int noofequip, int insuaram) {
			
			this.farmerid = farmerid;
			this.fname = fname;
			this.landarea = landarea;
			this.city = city;
			this.anninc = anninc;
			this.noofequip = noofequip;
			this.insuaram = insuaram;
		}

		void display() {
			
			System.out.println("farmer id: "+this.farmerid);
			System.out.println(" name: "+this.fname);
			System.out.println("land area: "+this.landarea);
			System.out.println("city: "+this.city);
			System.out.println("annic: "+this.anninc);
			System.out.println("no of equipment: "+this.noofequip);
			System.out.println("insuarence amount: "+this.insuaram);
		}
		
	        
	}// Farmer class ends

	class Dairy extends Farmer{
		int noofcattles;
		String milkper;
		int dairylicno;
		
		
		public int getNoofcattles() {
			return noofcattles;
		}
		public void setNoofcattles(int noofcattles) {
			this.noofcattles = noofcattles;
		}
		public String getMilkper() {
			return milkper;
		}
		public void setMilkper(String milkper) {
			this.milkper = milkper;
		}
		public int getDairylicno() {
			return dairylicno;
		}
		public void setDairylicno(int dairylicno) {
			this.dairylicno = dairylicno;
		}
		
		void calsubcd(){
			System.out.println("recieved subcd based on milk");
		}
		
		public Dairy() {
			super();
			this.noofcattles = 5;
			this.milkper = "10 litre";
			this.dairylicno = 18;
		}
		
		
		public Dairy(int farmerid, String fname, double landarea, String city, int anninc, int noofequip, int insuaram,int noofcattles, String milkper, int dairylicno) {
			
			super(farmerid,fname,landarea,city,anninc,noofequip,insuaram);
			
			this.noofcattles = noofcattles;
			this.milkper = milkper;
			this.dairylicno = dairylicno;
		}
		
		void display() {
			super.display();
			System.out.println("no of cattles: "+this.noofcattles);
			System.out.println("milk per day: "+this.milkper);
			System.out.println("dairy licence: "+this.dairylicno);
		}
		
		
	}// Dairy ends here

	class poultry extends Farmer{
		int noofchik;
		int noofshades;
		int noofhens;
		int noofeggs;
		int poultryno;
		
		
		public int getNoofchik() {
			return noofchik;
		}
		public void setNoofchik(int noofchik) {
			this.noofchik = noofchik;
		}
		public int getNoofshades() {
			return noofshades;
		}
		public void setNoofshades(int noofshades) {
			this.noofshades = noofshades;
		}
		public int getNoofhens() {
			return noofhens;
		}
		public void setNoofhens(int noofhens) {
			this.noofhens = noofhens;
		}
		public int getNoofeggs() {
			return noofeggs;
		}
		public void setNoofeggs(int noofeggs) {
			this.noofeggs = noofeggs;
		}
		public int getPoultryno() {
			return poultryno;
		}
		public void setPoultryno(int poultryno) {
			this.poultryno = poultryno;
		}
		
		void calsubcd(){
			System.out.println("Recieved subcd based on chicken");
		}
		
		public poultry() {
			super();
			this.noofchik = 400;
			this.noofshades = 5;
			this.noofhens = 5000;
			this.noofeggs = 2500;
			this.poultryno = 15;
		}
		
		public poultry(int farmerid, String fname, double landarea, String city, int anninc, int noofequip, int insuaram,int noofchik, int noofshades, int noofhens, int noofeggs, int poultryno) {
			
			super(farmerid,fname,landarea,city,anninc,noofequip,insuaram);
			
			this.noofchik = noofchik;
			this.noofshades = noofshades;
			this.noofhens = noofhens;
			this.noofeggs = noofeggs;
			this.poultryno = poultryno;
		}
		
		void display() {
			super.display();
			
			System.out.println("no of chik: "+this.noofchik);
			System.out.println("no of shades: "+this.noofshades);
			System.out.println("no of hens: "+this.noofhens);
			System.out.println("no of eggs: "+this.noofeggs);
			System.out.println("poultry no: "+this.poultryno);
		}
		
		
	}// poultry ends here

	class organic extends Farmer{
		int orgid;
		String croptype;
		String fertilizer;
		
		
		public int getOrgid() {
			return orgid;
		}
		public void setOrgid(int orgid) {
			this.orgid = orgid;
		}
		public String getCroptype() {
			return croptype;
		}
		public void setCroptype(String croptype) {
			this.croptype = croptype;
		}
		public String getFertilizer() {
			return fertilizer;
		}
		public void setFertilizer(String fertilizer) {
			this.fertilizer = fertilizer;
		}
		
		void calsubcd(){
			System.out.println("Recieved subcd based on crop");
		}
		
		public organic() {
			super();
			this.orgid = 10;
			this.croptype = "soya";
			this.fertilizer = "organ";
		}
		
		
		public organic(int farmerid, String fname, double landarea, String city, int anninc, int noofequip, int insuaram,int orgid, String croptype, String fertilizer) {
			
			super(farmerid,fname,landarea,city,anninc,noofequip,insuaram);
			
			this.orgid = orgid;
			this.croptype = croptype;
			this.fertilizer = fertilizer;
		}
		
		void display() {
			super.display();
			
			System.out.println("organic id: "+this.orgid);
			System.out.println("crop type: "+this.croptype);
			System.out.println("fertilizer: "+this.fertilizer);
			
		}
		
	}// organic ends here

	class TestFarmer{
		public static void main(String [] args) {
			
			Farmer f1 = new Farmer();
			
			Dairy d1=new Dairy();
			
			poultry p1=new poultry();
			
	      organic o1=new organic();
			
			f1.display();
			d1.calsubcd();
			p1.calsubcd();
			
			
			
			
			
			
		}
	}



