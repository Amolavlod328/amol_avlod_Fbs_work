package exception;

public class Tes {
	
	public static void main(String [] args) {
		voter v1= new voter(12);
		
		  try {
			v1.valid();
		} catch (InvalidAgeException e) {
		
			e.printStackTrace();
		}
	}

}
