import java.util.Scanner;
class Student
{
  int rno;
  String name;
  double marks;
void setrno(int r)
{
  this.rno=r;
}
void setname(String n)
{
 this.name=n;
}
void setmarks(double m)
{
 this.marks=m;
}

int getRno()
{
  return this.rno;
}
String getName()
{
 return this.name;
}
double getMarks()
{
 return this.marks;
}

void display(){
  System.out.println("id no is "+ this.getRno());
  System.out.println("name is "+ this.getName());
  System.out.println("marks is "+ this.getMarks());
}


Student(){
  this.rno=21;
  this.name="shrikant";
  this.marks=74.54;
}

Student(int i,String n,double s){

System.out.println("parameterized constructor called");
    this.rno=i;
    this.name=n;
    this.marks=s;
    
}



}
// class ends here


class TestStudent
{
  public static void main(String [] t)
{

 Student s1,s2;
 
 s2=new Student();
Scanner sc= new Scanner(System.in);
System.out.println("ENTER Id");
int i = sc.nextInt();
sc.nextLine();
System.out.println("ENTER NAME");
String n = sc.nextLine();
System.out.println("ENTER Marks");
double s = sc.nextDouble();

s1=new Student(i,n,s);
 
//s2.display();

s1.display();
//System.out.println("student info: "+s1.rno + s1.name + s1.marks);
}
}