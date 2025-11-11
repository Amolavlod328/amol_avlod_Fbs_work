import java.util.Scanner;
class Date{
int date,month,year;
String dow;

void setDate(int x){
this.date=x;
}

void setMonth(int x){
this.month=x;
}

void setYear(int x){
this.year=x;
}

int getDay(){

   return this.date;
}

int getMonth(){

   return this.month;
}

int getYear(){

   return this.year;
}


void display(){
 System.out.println("Day is : "+ this.date);
 System.out.println("Month is : "+ this.month);
 System.out.println("year is : "+ this.year);
System.out.println("day of week is : "+ this.dow);
} 


Date(){

System.out.println("constructor called");
   this.date=31;
   this.month=12;
   this.year=2025;
   this.dow="sunday";
}

Date(int d,int m,int y,String r){

System.out.println("constructor called");
   this.date=d;
   this.month=m;
   this.year=y;
   this.dow=r;
}






} //date ends here

class Test{
public static void main(String [] args){
  Date d1,d2,d3; //reference
 
  d2 = new Date();
  d3= new Date();


  d2.setDate(21);
  d2.setMonth(10);
  d2.setYear(2025);


Scanner sc= new Scanner(System.in);

System.out.println("ENTER DAY");
int i = sc.nextInt();

System.out.println("ENTER MONTH");
int n = sc.nextInt();

System.out.println("ENTER YEAR");
int y = sc.nextInt();

sc.nextLine();

System.out.println("DAY OF WEEK");
String a= sc.nextLine();

 d1 = new Date(i,n,y,a);

d1.display();

 


  //System.out.println("Date is: "+d1.date +"/"+ d1.month +"/"+d1.year);
   
   }//main ends here
}//Test class ends here