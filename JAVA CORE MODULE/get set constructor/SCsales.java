import java.util.Scanner;
class SalesManager
{
 int id;
 String name;
 double salary;
 int incen,target;

void setId(int I)
{
   this.id=I;
}
void setName(String n)
{
 this.name=n;
}
 
void setSalary(double d)
{
  this.salary=d;
}

void setIncen(int x)
{
  this.incen=x;
}

void setTarget(int t)
{
 this.target=t;
}


int getId()
{
   return this.id;
}
String getName()
{
  return this.name;
}
 
double getSalary()
{
  return this.salary;
}

int getIncen()
{
  return this.incen;
}

int getTarget(int t)
{
 return this.target;
}

void display(){
    System.out.println(" ID : " + this.id);
    System.out.println(" NAME : " + this.name);
    System.out.println(" SALARY : " + this.salary);
    System.out.println(" INCEN : " + this.incen);
    System.out.println(" TARGET : " + this.target);
}

SalesManager(){
   id=101;
   name="shrii";
   salary=106666;
   incen=1088;
   target=12;
}


SalesManager(int i,String n,double s,int a,int t){
   id=i;
   name=n;
   salary=s;
   incen=a;
   target=t;
}




}// class ends here


class TestSales
{
public static void main(String [] x)
{
 SalesManager s,s1,s2;
s= new SalesManager();
s1= new SalesManager();


s.setId(101);
s.setName("amol");
s.setSalary(5000);
s.setIncen(500);
s.setTarget(10000);

Scanner sc= new Scanner(System.in);
System.out.println("ENTER Id");
int i = sc.nextInt();
sc.nextLine();
System.out.println("ENTER NAME");
String n = sc.nextLine();
System.out.println("ENTER SALARY");
double sa = sc.nextDouble();
System.out.println("Enter Incen");
int a = sc.nextInt();
System.out.println("Enter Target");
int t = sc.nextInt();

s2= new SalesManager(i,n,sa,a,t);

//s.display();
//s1.display();
s2.display();
//System.out.println("salesman info "+"man id "+s.id+" name "+s.name+" salary "+s.salary+" incen "+s.incen+" target "+s.target);
}
}  //Test Salesmanager ends
 