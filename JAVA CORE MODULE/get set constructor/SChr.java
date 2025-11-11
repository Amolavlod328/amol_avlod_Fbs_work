import java.util.Scanner;
class Hr
{
 int id;
 String name;
 double salary,comm;
void setId(int I){
  this.id=I;
}

void setName(String n){ 
  this.name=n;
}

void setSalary(int s){
  this.salary=s;
}
void setComm(int c){
 this.comm=c;
}


int getId(){
  return this.id;
}

String getName(){ 
 return this.name;
}

double getSalary(){
  return this.salary;
}
double getComm(){
 return this.comm;
}

void display(){
   System.out.println("ID : " +this.id);
   System.out.println("ID : " +this.name);
   System.out.println("ID : " +this.salary);
   System.out.println("ID : " +this.comm);
}

Hr(){

System.out.println("constructor called");
    this.id=101;
    this.name="shrikant";
    this.salary=12000;
    this.comm=1200;
}

Hr(int i,String n,double s,double c){

System.out.println("parameterized constructor called");
    this.id=i;
    this.name=n;
    this.salary=s;
    this.comm=c;
}




}//class ends here
class TestHr
{
public static void main(String [] x)
{
 Hr h,g,h2;
 h=new Hr();
 
h2=new Hr();

 h.setId(1);
 h.setName("Shrikant");
 h.setSalary(50000);
 h.setComm(5000);


h.display();
h2.display();


Scanner sc= new Scanner(System.in);
System.out.println("ENTER Id");
int i = sc.nextInt();
sc.nextLine();
System.out.println("ENTER NAME");
String n = sc.nextLine();
System.out.println("ENTER SALARY");
double s = sc.nextDouble();
System.out.println("COMMISSION :");
int a = sc.nextInt();

g=new Hr(i,n,s,a);
g.display();


 //System.out.println("Hr id: "+h.id +" name: "+h.name+" salary "+h.salary+" comm "+h.comm);
}
}//class TestHr ends 