package exception;

public class test {

	public static void main(String args[]) {
		
	
     try 
     {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a / b;
     }
     
     catch(ArrayIndexOutOfBoundsException e) {
    	 
    	 System.out.println("please provide 2 args");
     }
     
     catch(NumberFormatException n) {
    	 
    	 System.out.println("dont enter anything without digit");
     }
     
     catch(ArithmeticException a) {
    	 
    	 System.out.println("dont enter 0");
     }
     
	}
}
	

     

