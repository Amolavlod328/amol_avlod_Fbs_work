package Polymorphism02;

import java.util.Scanner;

public class Device {
	
	  String brand ;
	  double price;
	  String powerstatus;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPowerstatus() {
		return powerstatus;
	}
	public void setPowerstatus(String powerstatus) {
		this.powerstatus = powerstatus;
	}
	
	
	void msg(int a) {
		if ( a==1) {
			System.out.println("Devices are getting ON");
	     }
		else {
			System.out.println("still Device is off");
		}
	}
	public Device() {
		
		this.brand = "samsung";
		this.price = 50.000;
		this.powerstatus = "ON";
	}
	
	public Device(String brand, double price, String powerstatus) {
		
		this.brand = brand;
		this.price = price;
		this.powerstatus = powerstatus;
	}
	  
	  void display() {
		  System.out.println("brand is: "+this.brand);
		  System.out.println("price is: "+this.price);
		  System.out.println("power status: "+this.powerstatus);
	  }

}// device ends here

class mobile extends Device{
	  String network;
	  String camerares;
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getCamerares() {
		return camerares;
	}
	public void setCamerares(String camerares) {
		this.camerares = camerares;
	}
	
	void msg(int a) {
		if ( a==1) {
			System.out.println(" mobile is turning on");
	      }
		else {
			System.out.println("still mobile is off");
		}
	}
	public mobile() {
		super();
		this.network = "5G";
		this.camerares = "108p";
	}
	
	public mobile(String brand, double price, String powerstatus,String network, String camerares) {
		super(brand,price,powerstatus);
		this.network = network;
		this.camerares = camerares;
	}
	
	void display() {
		super.display();
		System.out.println("network type: "+this.network);
		System.out.println("camera resolution: "+this.camerares);
		System.out.println("------------------------------------------");
	}
	  
	  
}// device class end



class Laptop extends Device {
	
	String ram;
	String processor;
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public Laptop() {
		super();
		this.ram = "16GB";
		this.processor = "intel i7";
	}
	
	void msg(int a) {
		if ( a==1) {
			System.out.println("Laptop is turning on");
	   }
		else {
			System.out.println("still Laptop  is off");
		}
}
	
	public Laptop(String brand, double price, String powerstatus,String ram, String processor) {
		super(brand,price,powerstatus);
		this.ram = ram;
		this.processor = processor;
	}
	
	void display() {
		super.display();
		System.out.println("Ram is: "+this.ram);
		System.out.println("processor is: "+this.processor);
		System.out.println("------------------------------------------");
	}
}// class laptop ends here



class earbuds extends Device{
	 String basslevel;
	 String noisecancelation;
	 
	public String getBasslevel() {
		return basslevel;
	}
	public void setBasslevel(String basslevel) {
		this.basslevel = basslevel;
	}
	public String getNoisecancelation() {
		return noisecancelation;
	}
	public void setNoisecancelation(String noisecancelation) {
		this.noisecancelation = noisecancelation;
	}
	
	void msg(int a) {
		if ( a==1) {
			System.out.println("Earbuds is turning on");
	      }
		else {
			System.out.println("still earbuds "
					+ "is off");
		}
}
	
	public earbuds() {
		super();
		this.basslevel = "High";
		this.noisecancelation = "Yes";
	}
	
	public earbuds(String brand, double price, String powerstatus,String basslevel, String noisecancelation) {
		super(brand,price,powerstatus);
		this.basslevel = basslevel;
		this.noisecancelation = noisecancelation;
	}
	 
	void display() {
		super.display();
		System.out.println("Bass level is: ");
		System.out.println("noise cancellation avoil ?: "+this.noisecancelation);
		System.out.println("------------------------------------------");
	}
	 
	
}// earbuds ends

class TestDevice{
	public static void main(String args[]) {
		
		Scanner in=new Scanner(System.in);
		
		Device d1=new Device();
		
		mobile m1=new mobile();
		m1.display();
		
		Device d2=new mobile("vivo",50000,"ON","5g","200p");
		d2.display();
		
		Laptop l1=new Laptop();
		l1.display();
	
         earbuds e1=new earbuds();
         e1.display();
		  
	
		
		
		System.out.println("all devices are off");
		System.out.println("enter 1 in msg to on all device: ");
		int a=in.nextInt();
		
		
		d1.msg(a);
		l1.msg(a);
		
		
		
	
		
	}
}

