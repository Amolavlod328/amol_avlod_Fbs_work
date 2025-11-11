class Printer
{
void print()
{
System.out.println();
}

void print(int x)
{
 System.out.println(x);
}

void print(char c)
{
  System.out.println(c);
}

void print(String s)
{
 System.out.println(s);
}
}

 class TestPrint
{
public static void main(String []a)
{
Printer p1=new Printer();
p1.print();
p1.print(10);
p1.print("a");
p1.print("virat");
}
}
 
 