package inheritance01;

public class Course {
	String courseName;
    double duration; 
    double fees;
    
    //  Default Constructor
    
    Course() {
        this.courseName = "Java Programming";
        this.duration = 6; 
        this.fees = 35000.0;
    }

	Course(String courseName, double duration, double fees) {
		
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}

	String getCourseName() {
		return courseName;
	}

	void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	double getDuration() {
		return duration;
	}

	void setDuration(double duration) {
		this.duration = duration;
	}

	double getFees() {
		return fees;
	}

	void setFees(double fees) {
		this.fees = fees;
	}
	
	// Display 
	
	 void display() {
	       
	        System.out.println("Course Name : " +this.courseName);
	        System.out.println("Duration    : " +this.duration + " months");
	        System.out.println("Fees : " + this.fees);
	    }
	 
} // class Course ends here 

class OnlineCourse extends Course {
	
    String platform;  
    boolean hasCertificate;
    
    //  Default Constructor
    
    OnlineCourse() {
        super(); 
        this.platform = "Udemy";
        this.hasCertificate = true;
    }

    // Parameterized Constructor
    
	public OnlineCourse(String courseName, double duration, double fees,String platform, boolean hasCertificate) {
		
		super(courseName, duration, fees);
		this.platform = platform;
		this.hasCertificate = hasCertificate;
	}
	
	// Getter and Setter Methods

	String getPlatform() {
		return platform;
	}

	void setPlatform(String platform) {
		this.platform = platform;
	}

	boolean isHasCertificate() {
		return hasCertificate;
	}

	void setHasCertificate(boolean hasCertificate) {
		this.hasCertificate = hasCertificate;
	}
	
	// Display 
	
	 void display() {
		 
	        System.out.println("----- Online Course Details -----\n");
	        super.display();
	        super.display(); // show Course details
	        System.out.println("Platform       : " + platform);
	        System.out.println("Has Certificate: " + hasCertificate);
	    }
    
}

class OfflineCourse extends Course {
	
    String location;  
    int batchSize;
    
    //  Default Constructor
    
    OfflineCourse() {
    	
        super();
        this.location = "Pune";
        this.batchSize = 25;
    }

 // Parameterized Constructor
    
	public OfflineCourse(String courseName, double duration, double fees,String location, int batchSize) {
		
		super(courseName, duration, fees);
		this.location = location;
		this.batchSize = batchSize;
	}
	
	// Getter and Setter Methods

	String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}

	int getBatchSize() {
		return batchSize;
	}

	void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	
	// Display 
	
	void display() {
		
        System.out.println("\n----- Offline Course Details -----\n");
        super.display();
        super.display(); // show parent Course details
        System.out.println("Location   : " + location);
        System.out.println("Batch Size : " + batchSize);
    }

    
}

 class Testcourse {

	public static void main(String[] args) {
		
		OnlineCourse o1 = new OnlineCourse();
		o1.display();
		
		OfflineCourse of1 = new OfflineCourse("python",6,35000,"pune,",60);
		of1.display();
		
		
	}

}



