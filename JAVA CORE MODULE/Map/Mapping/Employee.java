package Mapping;

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
	 
	 double calsal()
	 {
		 return salary;
	 }
	
	Employee(){
		this.id=17;
		this.name="ab";
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
	
	public String toString()
	{
		return "Employee id is: "+this.id+this.name+this.salary;
	}
	
	void display() {
		System.out.println("----------------------------------- ");
		System.out.println("id is: "+this.id);
		System.out.println("name is "+this.name);
		System.out.println("salary is: "+this.salary);
		
	}

}
