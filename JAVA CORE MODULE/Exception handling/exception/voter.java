package exception;

public class voter {
	
	int age ;

	
	
	 voter(int age) {
		
		this.age = age;
	}
	
	void valid() throws InvalidAgeException{
		
		if(this.age < 18 ) {
			
			
	}
		else {
			System.out.println("you can vote");
		}
		
		
		
	}
	
	

}
