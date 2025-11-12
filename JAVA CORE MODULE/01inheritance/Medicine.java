package inheritance01;

public class Medicine {
	
	 String name;
	 String dosage;
	 String expirydte;
	 String manufacturer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getExpirydte() {
		return expirydte;
	}
	public void setExpirydte(String expirydte) {
		this.expirydte = expirydte;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Medicine() {
	
		this.name = "Dolo 650";
		this.dosage = "650 m";
		this.expirydte = "22-06-2027";
		this.manufacturer = "Pharma LTD";
	}
	
	public Medicine(String name, String dosage, String expirydte, String manufacturer) {
		
		this.name = name;
		this.dosage = dosage;
		this.expirydte = expirydte;
		this.manufacturer = manufacturer;
	}
	 
	void display() {
		
		System.out.println("name: "+this.name);
		System.out.println("Dosage: "+this.dosage);
		System.out.println("expiry date: "+this.expirydte);
		System.out.println("manufacturer: "+this.manufacturer);
		
	}
	 

}// medicine class ends

class Tablet extends Medicine{
	  int count;
	  String ischewable;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getIschewable() {
		return ischewable;
	}
	public void setIschewable(String ischewable) {
		this.ischewable = ischewable;
	}
	
	public Tablet() {
		super();
		this.count = 10;
		this.ischewable = "No";
	}
	 
	public Tablet(String name, String dosage, String expirydte, String manufacture,int count, String ischewable) {
		super(name,dosage,expirydte,manufacture);
		this.count = count;
		this.ischewable = ischewable;
	}
	 
	void display() {
		super.display();
		System.out.println("count: "+this.count);
		System.out.println("ischewable: "+this.ischewable);
	}
	
}// tablet ends 

class Syrup extends Medicine{
	
	   String flavour;
	   String bottlesize;
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public String getBottlesize() {
		return bottlesize;
	}
	public void setBottlesize(String bottlesize) {
		this.bottlesize = bottlesize;
	}
	public Syrup() {
		super();
		this.flavour = "Honey";
		this.bottlesize = "500 Ml";
	}
	
	public Syrup(String name, String dosage, String expirydte, String manufacture,String flavour, String bottlesize) {
		super(name,dosage,expirydte,manufacture);
		this.flavour = flavour;
		this.bottlesize = bottlesize;
	}
	   
	   void display() {
		   super.display();
		   System.out.println("flavour: "+this.flavour);
		   System.out.println("bottle size: "+this.bottlesize);
	   }
}// Syrup ends

class injection extends Medicine{
	String needlesize;
	String type;
	String liquid;
	public String getNeedlesize() {
		return needlesize;
	}
	public void setNeedlesize(String needlesize) {
		this.needlesize = needlesize;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getLiquid() {
		return liquid;
	}
	public void setLiquid(String liquid) {
		this.liquid = liquid;
	}
	public injection() {
		super();
		this.needlesize = "0.0 mm";
		this.type = "Needle";
		this.liquid="insulin";
	}
	
	public injection(String name, String dosage, String expirydte, String manufacture,String needlesize, String type,String liquid) {
		
		super(name,dosage,expirydte,manufacture);
		
		this.needlesize = needlesize;
		this.type = type;
		this.liquid = liquid;
	}
	
	void display() {
		super.display();
		System.out.println("needle size: "+this.needlesize);
		System.out.println("type: "+this.type);
		System.out.println("liquid: "+this.liquid);
	}
}// injection ends

class TestMedicine {
	public static void main(String []args) {
		
		Medicine m1=new Medicine();
		m1.display();
		
		Tablet t1=new Tablet();
		t1.display();
		
		
	}
}

