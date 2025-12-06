package exception;

public class Testmarks {
	
	public static void main(String args[]) {
		
		Student s1=new Student("Amol",50,101);
		
		try {
			s1.calmarks();
		} catch (InvalidMarksException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
