package exception;

public class Student {
	
	String name;
	int rollno;
	int marks;
	
	
	 Student(String name, int rollno, int marks) {


		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	 }
	 
	 void calmarks() throws InvalidMarksException {
		 
	if(marks >=35 &&marks <=49) {
		 System.out.println("pass class");
			
		}
	if(marks>=50 && marks <=59 ) {
		
		System.out.println("second class");
	}
	if(marks >=60 && marks <=74) {
		
		System.out.println("First class");
	}
	if(marks>=74 && marks<100) {
		
		System.out.println("Distinct");
		
	
	}
	
	if(marks>100 || marks<=0)  {
		 
               System.out.println("invalid marks");
		 }
	}
		
	}
	
	
	



