package inheritance01;

public class Social {
	String UserName;
	String Email;
	boolean IsPublic;
	boolean IsVerified;
	String countyOrygin;
	int NoOfPost;
	int like;
	int comments;
	String CreatedAt;
	
	// Default Constructor
	
	Social(){
		
		this.UserName = "Shanky.96k";
		this.Email = "shanky.com";
		this.IsPublic = true;
		this.IsVerified = false;
		this.countyOrygin = "india";
		this.NoOfPost = 3;
		this.like = 700;
		this.comments = 50;
		this.CreatedAt = "29-03-2004";
	}
	
	// Parameterized Constructor
	
	public Social(String userName, String email, boolean isPublic, boolean isVerified, String countyOrygin,
			int noOfPost, int like, int comments, String createdAt) {
		
		UserName = userName;
		Email = email;
		IsPublic = isPublic;
		IsVerified = isVerified;
		this.countyOrygin = countyOrygin;
		NoOfPost = noOfPost;
		this.like = like;
		this.comments = comments;
		CreatedAt = createdAt;
	}


	// Getter and Setter Methods

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public boolean isIsPublic() {
		return IsPublic;
	}

	public void setIsPublic(boolean isPublic) {
		IsPublic = isPublic;
	}

	public boolean isIsVerified() {
		return IsVerified;
	}

	public void setIsVerified(boolean isVerified) {
		IsVerified = isVerified;
	}

	public String getCountyOrygin() {
		return countyOrygin;
	}

	public void setCountyOrygin(String countyOrygin) {
		this.countyOrygin = countyOrygin;
	}

	public int getNoOfPost() {
		return NoOfPost;
	}

	public void setNoOfPost(int noOfPost) {
		NoOfPost = noOfPost;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public String getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(String createdAt) {
		CreatedAt = createdAt;
	}
	
	// Display 
	
	 void display() {
	        
	        System.out.println("User Name      : " + UserName);
	        System.out.println("Email          : " + Email);
	        System.out.println("Public Account : " + IsPublic);
	        System.out.println("Verified       : " + IsVerified);
	        System.out.println("Country Origin : " + countyOrygin);
	        System.out.println("No. of Posts   : " + NoOfPost);
	        System.out.println("Likes          : " + like);
	        System.out.println("Comments       : " + comments);
	        System.out.println("Created At     : " + CreatedAt);
	    }
	
	 
}

class Instagram extends Social {
	
	int noOfFollowers;
	int noOfFollowing;
	int noOfHighlights;
	int noOfPosts;
	int onOfAudioSave;
	
	// Default Constructor
	
	 Instagram() {
		 
		 	super();
	        this.noOfFollowers = 100;
	        this.noOfFollowing = 50;
	        this.noOfHighlights = 5;
	        this.noOfPosts = 20;
	        this.onOfAudioSave = 10;
	    }
	 
	// Parameterized Constructor

	 Instagram(String userName, String email, boolean isPublic, boolean isVerified, String countyOrygin,
			int noOfPost, int like, int comments, String createdAt,int noOfFollowers, int noOfFollowing, int noOfHighlights, int noOfPosts, int onOfAudioSave) {
		
		super(userName, email, isPublic, isVerified, countyOrygin, noOfPost, like, comments, createdAt);
		this.noOfFollowers = noOfFollowers;
		this.noOfFollowing = noOfFollowing;
		this.noOfHighlights = noOfHighlights;
		this.noOfPosts = noOfPosts;
		this.onOfAudioSave = onOfAudioSave;
	 }
	 
	// Getter and Setter Methods

	 public int getNoOfFollowers() {
		 return noOfFollowers;
	 }

	 public void setNoOfFollowers(int noOfFollowers) {
		 this.noOfFollowers = noOfFollowers;
	 }

	 public int getNoOfFollowing() {
		 return noOfFollowing;
	 }

	 public void setNoOfFollowing(int noOfFollowing) {
		 this.noOfFollowing = noOfFollowing;
	 }

	 public int getNoOfHighlights() {
		 return noOfHighlights;
	 }

	 public void setNoOfHighlights(int noOfHighlights) {
		 this.noOfHighlights = noOfHighlights;
	 }

	 public int getNoOfPosts() {
		 return noOfPosts;
	 }

	 public void setNoOfPosts(int noOfPosts) {
		 this.noOfPosts = noOfPosts;
	 }

	 public int getOnOfAudioSave() {
		 return onOfAudioSave;
	 }

	 public void setOnOfAudioSave(int onOfAudioSave) {
		 this.onOfAudioSave = onOfAudioSave;
	 }
	 
	 // Display

	 void display() {
		 
		 	
	        System.out.println("----- Instagram Account Details -----");
	        super.display();
	        System.out.println("Followers      : " + noOfFollowers);
	        System.out.println("Following      : " + noOfFollowing);
	        System.out.println("Highlights     : " + noOfHighlights);
	        System.out.println("Posts          : " + noOfPosts);
	        System.out.println("Audio Saved    : " + onOfAudioSave);
	    }
}// class Instagram ends here

class LinkedIn extends Social{
	
	int noOfConnection;
	int noOfProfileView;
	int noOfJobApplied;
	
	 LinkedIn() {
	        this.noOfConnection = 150;
	        this.noOfProfileView = 80;
	        this.noOfJobApplied = 5;
	    }

	 LinkedIn(String userName, String email, boolean isPublic, boolean isVerified, String countyOrygin,
			int noOfPost, int like, int comments, String createdAt,int noOfConnection, int noOfProfileView, int noOfJobApplied) {
		
		 super(userName, email, isPublic, isVerified, countyOrygin, noOfPost, like, comments, createdAt);
		 this.noOfConnection = noOfConnection;
		this.noOfProfileView = noOfProfileView;
		this.noOfJobApplied = noOfJobApplied;
	 }

	 public int getNoOfConnection() {
		 return noOfConnection;
	 }

	 public void setNoOfConnection(int noOfConnection) {
		 this.noOfConnection = noOfConnection;
	 }

	 public int getNoOfProfileView() {
		 return noOfProfileView;
	 }

	 public void setNoOfProfileView(int noOfProfileView) {
		 this.noOfProfileView = noOfProfileView;
	 }

	 public int getNoOfJobApplied() {
		 return noOfJobApplied;
	 }

	 public void setNoOfJobApplied(int noOfJobApplied) {
		 this.noOfJobApplied = noOfJobApplied;
	 }

	 // Display 
	 
	 void display() {
		 	
	        System.out.println("----- LinkedIn Account Details -----");
	        super.display();
	        System.out.println("Connections   : " + noOfConnection);
	        System.out.println("Profile Views : " + noOfProfileView);
	        System.out.println("Jobs Applied  : " + noOfJobApplied);
	    }
	 
}//Instagram ends here 


class YouTube extends Social{
	
	int noOfSubscriber;
	double watchTime;
	boolean isMonetized;
	double estimatedRevenue;
	
	 // Default Constructor
	
    YouTube() {
        this.noOfSubscriber = 10000;
        this.watchTime = 2500.75; // in hours
        this.isMonetized = true;
        this.estimatedRevenue = 1200.50; // in dollars
    }
    
    // Parameterized Constructor

	public YouTube(String userName, String email, boolean isPublic, boolean isVerified, String countyOrygin,
			int noOfPost, int like, int comments, String createdAt,int noOfSubscriber, double watchTime, boolean isMonetized, double estimatedRevenue) {
		
		super(userName, email, isPublic, isVerified, countyOrygin, noOfPost, like, comments, createdAt);
		this.noOfSubscriber = noOfSubscriber;
		this.watchTime = watchTime;
		this.isMonetized = isMonetized;
		this.estimatedRevenue = estimatedRevenue;
	}
	
	// Getter and Setter Methods

	public int getNoOfSubscriber() {
		return noOfSubscriber;
	}

	public void setNoOfSubscriber(int noOfSubscriber) {
		this.noOfSubscriber = noOfSubscriber;
	}

	public double getWatchTime() {
		return watchTime;
	}

	public void setWatchTime(double watchTime) {
		this.watchTime = watchTime;
	}

	public boolean isMonetized() {
		return isMonetized;
	}

	public void setMonetized(boolean isMonetized) {
		this.isMonetized = isMonetized;
	}

	public double getEstimatedRevenue() {
		return estimatedRevenue;
	}

	public void setEstimatedRevenue(double estimatedRevenue) {
		this.estimatedRevenue = estimatedRevenue;
	}
	
	// Display 
	
	void display() {
        System.out.println("----- YouTube Channel Details -----");
        super.display();
        System.out.println("Subscribers       : " + noOfSubscriber);
        System.out.println("Watch Time (hrs)  : " + watchTime);
        System.out.println("Monetized         : " + isMonetized);
        System.out.println("Estimated Revenue : $" + estimatedRevenue);
    }
    
    
}

 class SourceSocial {
	
	public static void main(String[] args) {
		
		Instagram i1 = new Instagram();
		i1.display();
		
		LinkedIn l1 = new LinkedIn();
		l1.display();
		
		YouTube y1 = new YouTube();
		y1.display();

	}

}