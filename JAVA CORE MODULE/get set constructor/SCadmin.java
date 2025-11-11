import java.util.*;
class Admin
{
  int id;
  String name;
  double salary;
  int allow;
void setId(int I)
{
  this.id=I;
}
void setName(String n)
{
  this.name=n;
}
void setSalary(double s)
{
 this.salary=s;
}
void setAllow(int b)
{
  this.allow=b;
}

void display(){
    System.out.println("Admin info");
    System.out.println("Admin id: "+this.id);
    System.out.println("Admin name: "+this.name);
    System.out.println("Admin salary: "+this.salary);
    System.out.println("Admin "+this.allow);
}

Admin(){
   id=101;
   name="shrii";
   salary=45000.00;
   allow=1000;
}


Admin(int i,String n,double d, int a){
   id=i;
   name=n;
   salary=d;
   allow=a;
}


}// class ends here



class TestAdmin
{
 public static void main (String []x)
{
 Admin a,a1;
 
 a=new Admin(102,"virat",12933.00,1200);

 a.setId(101);
 a.setName("Shrikant");
 a.setSalary(50000.00);
 a.setAllow(10000);

Scanner sc= new Scanner(System.in);
System.out.println("ENTER Id");

int i = sc.nextInt();

sc.nextLine();

System.out.println("ENTER NAME");
String n = sc.nextLine();

System.out.println("ENTER SALARY");
double s = sc.nextDouble();

System.out.println("ALLOWANCE");
int allow = sc.nextInt();

a1=new Admin(i,n,s,allow);
a1.display();
}
}//class TestAdmin ends



