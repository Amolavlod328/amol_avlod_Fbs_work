import java.util.Scanner;
class Complex {
    int real;
    int img;

void setreal(int r) {
        this.real = r;
}

void setimg(int i) {
        this.img = i;
}

int getreal() {
        return this.real;
 }

int getimg() {
        return this.img;
}

Complex() {
        real = 0;
        img = 0;
}

Complex(int r, int i) {
        real = r;
        img = i;
 }
void display() {
   System.out.println("Real part: " + real);
   System.out.println("Imaginary part: " + img);
}

}// class Complex ends here


class TestComplex {
    public static void main(String[] x) {
        Complex c1, c2, c3;

  c1 = new Complex();        
  
  c3 = new Complex();           

  c3.setreal(18);
  c3.setimg(18);

 Scanner sc= new Scanner(System.in);
System.out.println("ENTER REAL NUMBER :");
int i = sc.nextInt();
System.out.println("ENTER IMAGINARY NUMBER");
int a = sc.nextInt();
c2 = new Complex(i, a); 
c2.display();

}    

  } // class TestComplex ends here



