package inheritance01;

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
	 
		 Employee e1=new Employee();
		 Employee e2=new Employee(2,"Avlod",4000);
		// System.out.println("count: "+e1.getcount());
		 
		 Sales s1=new Sales();
		 Sales s2=new Sales(3,"andy",5000,400,1000);
		// System.out.println("count"+s1.getcount());
		  
		 Hr h1=new Hr();
		 Hr h2=new Hr(4,"Shantanu",5000,1000);
		// System.out.println("count: "+h2.getcount());
		 
		 Admin a1=new Admin();
		 Admin a2=new Admin(6,"Shrii",4000,1000);
		 //System.out.println("count: "+a2.getcount());
		 
		 e1.display();
		 e2.display();
		 
		 s1.display();
		 s2.display();
		 
		 h1.display();
		 h2.display();
		 
		 a1.display();
		 a2.display();
		 
		 System.out.println("count: "+e1.getcount());
		 
	
	}
	}
