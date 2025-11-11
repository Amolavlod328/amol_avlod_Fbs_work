import java.util.*;
class Distance
{
 
String km,m;

void setkm(String k)
{
  this.km=k;
}
void setm(String me)
{
 this.m=me;
}

String getKm(){
  return this.km;
}

String getM(){
  return this.m;
}

void Display(){
   System.out.println("KM is : " + this.getKm());
   System.out.println("METER is : " + this.getM());
}

Distance(){
  this.km="20 km";
  this.m="10 m";
}

Distance(String k,String m){
  this.km=k;
  this.m=m;
}







}//class ends here



class TestDistance
{
 public static void main(String[]x){

 Distance d1,d2;
 d2= new Distance();


d2.setkm("1 kilometer");
d2.setm("1000 miter");

Scanner sc= new Scanner(System.in);
System.out.println("ENTER KM");
String k = sc.nextLine();

sc.nextLine();
System.out.println("ENTER M");
String n = sc.nextLine();


d1= new Distance(k,n);
d1.Display();


 
}
}//TestDistance ends here
 