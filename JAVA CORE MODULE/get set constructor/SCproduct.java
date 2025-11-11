import java.util.Scanner;
class Product
{
  int pid,quantity;  
  String pname;
double price;
void setPid(int p1)
{
  this.pid=p1;
}
void setPrice(double p1)
{
  this.price=p1;
}

void setQuantity(int q)
{
  this.quantity=q;
}

void setPname(String n)
{
 this.pname=n;
}


int getPid()
{
  return this.pid;
}
double getPrice()
{
 return this.price;
}
int getQuantity()
{
  return this.quantity;
}
String getName()
{
 return this.pname;
}

void display(){
    System.out.println("product ID : "+ this.pid);
    System.out.println("product Name : "+ this.pname);
    System.out.println("product Price : "+ this.price);
    System.out.println("product Quantity : "+ this.quantity);
}

Product(){
    pid=102;
    pname="ab";
    price=1022;
    quantity=12;
}

Product(int i,String n,double p,int q){
    pid=i;
    pname=n;
    price=p;
    quantity=q;
}



}//class end here
class TestProduct
{
 public static void main(String[]t)
{
 Product p,p1,p2;
 p=new Product();
p1=new Product();


 p.setPid(01);
 p.setPrice(200);
 p.setQuantity(10);
 p.setPname("cricket bat");

Scanner sc= new Scanner(System.in);
System.out.println("ENTER PId");
int i = sc.nextInt();
sc.nextLine();
System.out.println("ENTER PRODUCT NAME");
String n = sc.nextLine();
System.out.println("ENTER PRICE");
double s = sc.nextDouble();
System.out.println("ENTER QUANTITY");
int a = sc.nextInt();

p2=new Product(i,n,s,a);

//p.display();
//p1.display();
p2.display();


// System.out.println("product: "+" prodict id: "+p.pid+" productname: "+p.pname+" productprice: "+p.price+" productquntity: "+p.quantity);
}
}
//class Testproduct ends here
  
   