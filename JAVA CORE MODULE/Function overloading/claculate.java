class Calculater {

    // ----- Addition -----
    void Add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    void Add(int a, double b) {
        double sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    void Add(double a, int b) {
        double sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    void Add(double a, double b) {
        double sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    // ----- Subtraction -----
    void Sub(double a, int b) {
        double diff = a - b;   
        System.out.println("Difference is: " + diff);
    }

    void Sub(int a, int b) {
        double diff = a - b;
        System.out.println("Difference is: " + diff);
    }

    void Sub(int a, double b) {
        double diff = a - b;  
        System.out.println("Difference is: " + diff);
    }

    void Sub(double a, double b) {
        double diff = a - b;
        System.out.println("Difference is: " + diff);
    }

    // ----- Multiplication -----
    void Mul(int a, int b) {
        int product = a * b;
        System.out.println("mul is: " + product);
    }

    void Mul(int a, double b) {
        double product = a * b;
        System.out.println("mult is: " + product);
    }

    void Mul(double a, int b) {
        double product = a * b;  
        System.out.println("Product is: " + product);
    }

    void Mul(double a, double b) {
        double product = a * b;
        System.out.println("Product is: " + product);
    }

    // ----- Division -----
    void Div(int a, int b) {
        double div = (double) a / b;
        System.out.println("Division is: " + div);
    }

    void Div(int a, double b) {
        double div = (double) a / b;
        System.out.println("Division is: " + div);
    }

    void Div(double a, int b) {
        double div = (double) a / b;
        System.out.println("Division is: " + div);
    }

    void Div(double a, double b) {
        double div = (double) a / b;
        System.out.println("Division is: " + div);
    }
}

// ----------------- Test Class -----------------
class TestCalculater {
    public static void main(String[] args) {

        Calculater c1 = new Calculater();

        c1.Add(5, 5);
        c1.Add(5, 10);
        c1.Add(5.5, 5);
        c1.Add(5.5, 5.5);

        c1.Sub(5, 5);
        c1.Sub(5, 10);
        c1.Sub(5.5, 5);
        c1.Sub(5.5, 5.5);

        c1.Mul(5, 5);
        c1.Mul(5, 10);
        c1.Mul(5.5, 5);
        c1.Mul(5.5, 5.5);

        c1.Div(5, 5);
        c1.Div(5, 10);
        c1.Div(5.5, 5);
        c1.Div(5.5, 5.5);
    }
}