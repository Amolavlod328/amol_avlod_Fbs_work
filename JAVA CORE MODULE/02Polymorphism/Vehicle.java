package Polymorphism02;


public class Vehicle {
	
	     String Brand;
	     String model;
	     int nofw;
	     int engc;
	     String fueltype;
	     static int count=0;
	     
	     
		 String getBrand() {
			return Brand;
		}
		 void setBrand(String band) {
			Brand = band;
		}
		 String getModel() {
			return model;
		}
		 void setModel(String model) {
			this.model = model;
		}
		 int getNofw() {
			return nofw;
		}
		 void setNofw(int nofw) {
			this.nofw = nofw;
		}
		 int getEngc() {
			return engc;
		}
		 void setEngc(int engc) {
			this.engc = engc;
		}
		 String getFueltype() {
			return fueltype;
		}
		 void setFueltype(String fueltype) {
			this.fueltype = fueltype;
			}// setters gettrs ends
		 
		 void brake() {
			 System.out.println("brake ");
		 }
		 
		 
		Vehicle(){
			this.Brand="Audi";
			this.model="A6";
			this.nofw=4;
			this.engc=2;
			this.fueltype="petrol";
			this.count++;
		}
		
		Vehicle(String brand, String model, int nofw, int engc, String fueltype) {
			 
			 System.out.println("parameterized constructor");
			
			this.Brand = brand;
			this.model = model;
			this.nofw = nofw;
			this.engc = engc;
			this.fueltype = fueltype;
			this.count++;
		}
		
		static int getcount() {
			return count;
		}
		
		void display() {
			
			System.out.println("brand is: "+this.Brand);
			System.out.println("model is: "+this.model);
			System.out.println("no of wheels: "+this.nofw);
			System.out.println("engine capacity: "+this.engc);
			System.out.println("fuel type: "+this.fueltype);
			
			
		}
		
	} //class vehicle ends
	 
	 class car extends Vehicle{
		 String airbag;
		 int noofd;
		 
		 
		 String getAirbag() {
			return airbag;
		}
		 void setAirbag(String airbag) {
			this.airbag = airbag;
		}
		 int getNoofd() {
			return noofd;
		}
		 void setNoofd(int noofd) {
			this.noofd = noofd;
		}
		 
		 void brake() {
			 System.out.println("air brake applied ");
		 }
		
		car(){
			super();
			this.airbag="yes";
			this.noofd=4;
		}
		 
		 car(String brand, String model, int nofw, int engc, String fueltype,String airbag, int noofd) {
			super(brand,model,nofw,engc,fueltype);
			this.airbag = airbag;
			this.noofd = noofd;
		}
		 
		 void display() {
			 super.display();
			 System.out.println("airbag : "+this.airbag);
			 System.out.println("no of doors: "+this.noofd);
			 System.out.println("----------------------------------- ");
		 } 
		 
	 }// cars ends here
	 
	 class Truck extends Vehicle{
		  String emgdoor;

		 String getEmgdoor() {
			return emgdoor;
		}

		 void setEmgdoor(String emgdoor) {
			this.emgdoor = emgdoor;
		}
		 
		 void brake() {
			 System.out.println(" truck brake applied ");
		 }

		 Truck() {
			super();
			this.emgdoor = "yes";
		}

		 Truck(String brand, String model, int nofw, int engc, String fueltype,String emgdoor) {
			super(brand,model,nofw,engc,fueltype);
			this.emgdoor = emgdoor;
		}
		 
		 void display() {
			 super.display();
			 System.out.println("energency doors: "+this.emgdoor);
			 System.out.println("----------------------------------- ");
		 }
		 
	}// Truck ends here
	 
	 class Bike extends Vehicle{
		      String Stand;
		      String doors;
		      
			 String getStand() {
				return Stand;
			}
			 void setStand(String stand) {
				Stand = stand;
			}
			 String getDoors() {
				return doors;
			}
			 void setDoors(String doors) {
				this.doors = doors;
			}
			 
			 void brake() {
				 System.out.println(" bike brake applied ");
			 }
			 
			 
			    Bike() {
				super();
				Stand = "yes";
				this.doors = "no";
			}
				public Bike(String brand, String model, int nofw, int engc, String fueltype,String stand, String doors) {
					super(brand,model,nofw,engc,fueltype);
					Stand = stand;
					this.doors = doors;
				}
				
				void display() {
					super.display();
					System.out.println("Stsnd: "+this.Stand);
					System.out.println("doors: "+this.doors);
					System.out.println("----------------------------------- ");
				}   
	 } // bike class ends
	 
	 class TestVehicle{
		 public static void main(String []args) {
			 
			 Vehicle v1=new Vehicle();
			 Vehicle v2=new Vehicle("Rools royce","R1",4,5,"petrol");
			 System.out.println("count: "+v1.getcount());
			 
			 car c1=new car();
			 car c2=new car("mercedes","m1",4,6,"petrol","yes",4);
			 
			 Truck t1=new Truck();
			 Truck t2=new Truck("ashok leyland","eicher",6,6,"diesel","yes");
			 
			 Bike b1=new Bike();
			 Bike b2=new Bike("KTM","Duke",2,5,"petrol","yes","no");
			 
			c1.brake();
			t1.brake();
			 
			 
			 
			 
//			 v1.display();
//			 v2.display();
//			 
//			 c1.display();
//			 c2.display();
//			 
//			 t1.display();
//			 t2.display();
//			 
//			 b1.display();
//			 b2.display();
			 
			// System.out.println("count: "+v1.getcount());
		 }
	 }

