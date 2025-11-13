package Polymorphism02;

class Employee {
	 
	 
			
			int id;
			String name;
			int salary;
			static int count=0;
			
			 int getId() {
				return id;
			}
			 void setId(int id) {
				this.id = id;
			}
			 String getName() {
				return name;
			}
			 void setName(String name) {
				this.name = name;
			}
			 int getSalary() {
				return salary;
			}
			 void setSalary(int salary) {
				this.salary = salary;
			}
			 
			 double calsal() {
				 return salary;
			 }
			
			Employee(){
				this.id=18;
				this.name="virat";
				this.salary=500000;
				this.count++;
				System.out.println("default constructor");
			}
			
			Employee(int id,String name,int salary){
				this.id=id;
				this.name=name;
				this.salary=salary;
				this.count++;
				System.out.println("parameterized");
				
			}
			
			static int getcount() {
				return count;
			}
			
			void display() {
				System.out.println("----------------------------------- ");
				System.out.println("id is: "+this.id);
				System.out.println("name is "+this.name);
				System.out.println("salary is: "+this.salary);
				
			}

		}// class employee ends here

		class Sales extends Employee{
			int incen;
			int target;
			
			 int getIncen() {
				return incen;
			}
			 void setIncen(int incen) {
				this.incen = incen;
			}
			 int getTarget() {
				return target;
			}
			 void setTarget(int target) {
				this.target = target;
			}
			 
			 double calsal() {
				 return salary+incen;
			 }
			
			Sales(){
				super();
				this.incen=400;
				this.target=1000;
				
			}
			
			Sales(int id,String name,int salary,int in,int ta){
				super(id,name,salary);
				this.incen=in;
				this.target=ta;
				
			}
			void display() {
				super.display();
				System.out.println("incen is: "+this.incen);
				System.out.println("target is: "+this.target);
			}
		}//Sales ends

		class Areasalesman extends Sales{
			String Area;

			 String getArea() {
				return Area;
			}

			 void setArea(String area) {
				Area = area;
			}

			 Areasalesman() {
			
				 super();
				 System.out.println("area constructor call");
				this.Area = "karve nagar kothrud";
				
			}
			 
			 Areasalesman(int id,String name,int salary,int in,int ta,String area) {
					super(id,name,salary,in,ta);
					this.Area = area;
				}
			 void display() {
				 super.display();
				 System.out.println("area is: "+this.Area);
			 }
			
		}

		class Hr extends Employee{
			int comm;

			 int getComm() {
				return comm;
			}

			 void setComm(int comm) {
				this.comm = comm;
			}
			
			Hr(){
				super();
				this.comm=4000;
			}
			
			 double calsal() {
				 return salary+comm;
			 }
			 
			Hr(int id,String name,int salary,int c){
				super(id,name,salary);
				this.comm=c;
			}
			void display() {
				
				super.display();
				System.out.println("comm is: "+this.comm);
				System.out.println("----------------------------------- ");
				
			}
		}//class Hr ends
		class Admin extends Employee{
			int allow;

			 int getAllow() {
				return allow;
			}

			 void setAllow(int allow) {
				this.allow = allow;
			}
			
			Admin(){
				super();
				this.allow=2000;
				
			}
			
			 double calsal() {
				 return salary+allow;
			 }
			 
			Admin(int id,String name,int salary,int a){
				super(id,name,salary);
				this.allow=a;
			}
			void display() {
				
				super.display();
				System.out.println("comm id: "+this.allow);
				System.out.println("----------------------------------- ");
			}
		}// Admin endsww here

		class TestEmployee{
			public static void main(String []args) {
			 
				 Employee e1=new Sales(17,"Ab deviliers",5000,4000,500);
				 Employee e2=new Hr(2,"Avlod",4000,4000);
				 
				 Hr h1=new Hr();
				
				        e1.display();
				        e2.display();
				        
				        System.out.println("calculate salasy"+h1.calsal());
				        System.out.println("calculate salasy"+e1.calsal());
				

				 
			
			}
			}



