package Polymorphism02;

public class Artist {
	
	
	    String name;
	    String artStyle;
	    
	    

	   String getName() {
			return name;
		}

		void setName(String name) {
			this.name = name;
		}

		String getArtStyle() {
			return artStyle;
		}

		void setArtStyle(String artStyle) {
			this.artStyle = artStyle;
		}// Getters And Setters Ends Here

		Artist() {
	        this.name = "Unknown Artist";
	        this.artStyle = "General Art";
	    }

	    Artist(String name, String artStyle) {
	        this.name = name;
	        this.artStyle = artStyle;
	    }// Constructors Ends here

	    void perform() {
	        System.out.println(name + " is performing their art.");
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Art Style: " + artStyle);
	    }
	}// class Artist Ends Here

	class Singer extends Artist {
	    String genre;
	    String famousSong;
	    
	    

	   String getGenre() {
			return genre;
		}

		void setGenre(String genre) {
			this.genre = genre;
		}

		String getFamousSong() {
			return famousSong;
		}

		void setFamousSong(String famousSong) {
			this.famousSong = famousSong;
		}// Getters And SEtters ends here

		Singer() {
	        super();
	        this.genre = "Classical";
	        this.famousSong = "Unknown";
	    }

	    Singer(String name, String artStyle, String genre, String famousSong) {
	        super(name, artStyle);
	        this.genre = genre;
	        this.famousSong = famousSong;
	    }

	    void perform() {
	        System.out.println(name + " is singing a " + genre + " song: \"" + famousSong + "\".");
	    }

	    void display() {
	        System.out.println("\n--- SINGER ---");
	        super.display();
	        System.out.println("Genre: " + genre);
	        System.out.println("Famous Song: " + famousSong);
	    }
	}// Class Singer ends here

	class Painter extends Artist {
	    String paintingStyle;
	    String famousPainting;
	    
	    

	   String getPaintingStyle() {
			return paintingStyle;
		}

		void setPaintingStyle(String paintingStyle) {
			this.paintingStyle = paintingStyle;
		}

		String getFamousPainting() {
			return famousPainting;
		}

		void setFamousPainting(String famousPainting) {
			this.famousPainting = famousPainting;
		}// Getters And Setters End here

		Painter() {
	        super();
	        this.paintingStyle = "Modern";
	        this.famousPainting = "Untitled";
	    }

	    Painter(String name, String artStyle, String paintingStyle, String famousPainting) {
	        super(name, artStyle);
	        this.paintingStyle = paintingStyle;
	        this.famousPainting = famousPainting;
	    }//Coonstructors end here

	    void perform() {
	        System.out.println(name + " is painting a masterpiece in " + paintingStyle + " style.");
	    }

	    void display() {
	        System.out.println("\n--- PAINTER ---");
	        super.display();
	        System.out.println("Painting Style: " + paintingStyle);
	        System.out.println("Famous Painting: " + famousPainting);
	    }
	}// Class Painter Ends here

	class Actor extends Artist {
	    String movieName;
	    String roleType;
	    
	    
	    
	    

	   String getMovieName() {
			return movieName;
		}

		void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		String getRoleType() {
			return roleType;
		}

		void setRoleType(String roleType) {
			this.roleType = roleType;
		}//getters and setters ends here

		Actor() {
	        super();
	        this.movieName = "Unknown";
	        this.roleType = "Supporting";
	    }

	    Actor(String name, String artStyle, String movieName, String roleType) {
	        super(name, artStyle);
	        this.movieName = movieName;
	        this.roleType = roleType;
	    }

	    void perform() {
	        System.out.println(name + " is acting as " + roleType + " in the movie \"" + movieName + "\".");
	    }

	    void display() {
	        System.out.println("\n--- ACTOR ---");
	        super.display();
	        System.out.println("Movie Name: " + movieName);
	        System.out.println("Role Type: " + roleType);
	    }
	}//class Actor ends here-

	class TestArtist {
	    public static void main(String[] args) {
	        Artist[] arr=new Artist[3];

	        arr[0] = new Singer("Kishor kumar", "Singing", "Classical / Playback", "Pal Pal dil ke pass");
	        

	        arr[1] = new Painter("M. F. Husain", "Painting", "Modern / Cubist", "Horses Series");
	       

	        arr[2] = new Actor("Rocking star yash", "Acting", "KGF", "Lead Role");
	       
	        for(int i=0;i<arr.length;i++) {
	        	arr[i].display();
	        	arr[i].perform();
	        }
	    }
	}


