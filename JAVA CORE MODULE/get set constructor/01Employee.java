import java.util.*;
class Employee {

	int Id;
	String Name;
	double Salary;


	void setId(int a){

	this.Id = a;

	}

	void setName(String b){

	this.Name = b;

	}

	void setSalary(double c){

	this.Salary = c;

	} // set ends here 


	int getId(){

	return this.Id;

	}

	String getName(){

	return this.Name;

	}

	double getSalary(){

	return this.Salary;
	
	}//get ends here


	Employee(){

	System.out.println("Default Consister ");

	this.Id = 102;
	this.Name = "shiva";
	this.Salary = 55000;

	}//default consister ends here

	Employee(int a,String b,double c){

	System.out.println("Paramiterise Consister ");

	this.Id = a;
	this.Name = b;
	this.Salary = c;

	}//Paramiterise consister ends here


	void display(){

	System.out.println("Empoyee ID is: "+this.Id);
	System.out.println("Employee Name: "+this.Name);
	System.out.println("Employee Salary: "+this.Salary);

	}
	
	


} /// Employee Class End here 


class TestEmployee {

	public static void main(String[]args){

	Employee e1 = new Employee();
	Employee e2 = new Employee(33,"avlod",50000);
	Employee e3 = new Employee(103,"Shankar",650000);
        Employee e4;

	//e1.setId(101);
	//e1.setName("Shanky");
	//e1.setSalary(50000);
      
Scanner in=new Scanner(System.in);

System.out.println("ENTER id");
int a = in.nextInt();

in.nextLine();

System.out.println("ENTER name");
String b = in.nextLine();

System.out.println("ENTER ACNO");
double c = in.nextDouble();

e4=new Employee( a, b,c);

	e1.display();
	e2.display();
	e3.display();
        e4.display();
       
       


	}

}