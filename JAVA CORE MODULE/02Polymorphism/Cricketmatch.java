package Polymorphism02;

 class CricketMatch {
	
	 String teams;
	    String venue;
	    String date;
	    String umpire;
		public String getTeams() {
			return teams;
		}
		public void setTeams(String teams) {
			this.teams = teams;
		}
		public String getVenue() {
			return venue;
		}
		public void setVenue(String venue) {
			this.venue = venue;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getUmpire() {
			return umpire;
		}
		public void setUmpire(String umpire) {
			this.umpire = umpire;
		}//getters and setters ends here
		
		CricketMatch(String teams, String venue, String date, String umpire) {
			this.teams = teams;
			this.venue = venue;
			this.date = date;
			this.umpire = umpire;
		}
		
		CricketMatch() {
			this.teams ="RCB Vs CSK";
			this.venue = "M Chinnaswami Stadium, Bengaluru";
			this.date = "12 may 2025";
			this.umpire = "Anil Choudhary";
		}// constructors ends here
		
		void display() {
			System.out.println("Teams : "+this.teams);
			System.out.println("Venue : "+this.venue);
			System.out.println("Date : "+this.date);
			System.out.println("Umpire : "+this.umpire);
		}
		
		double approxMatchDuration() {
			return 0.0;
		}
		
		
	    
	    
	}// class CricketMatch ends here

	class TestMatch extends CricketMatch {
	    int days;
	    int oversPerDay;
	    boolean hasLunchBreak;
		public int getDays() {
			return days;
		}
		void setDays(int days) {
			this.days = days;
		}
		int getOversPerDay() {
			return oversPerDay;
		}
		void setOversPerDay(int oversPerDay) {
			this.oversPerDay = oversPerDay;
		}
		boolean isHasLunchBreak() {
			return hasLunchBreak;
		}
		void setHasLunchBreak(boolean hasLunchBreak) {
			this.hasLunchBreak = hasLunchBreak;
		}// getters and setters ends here
		public TestMatch() {
			super();
			this.days = 5;
			this.oversPerDay = 90;
			this.hasLunchBreak = true;
		}
		
		public TestMatch(String teams, String venue, String date, String umpire, int days, int oversPerDay,
				boolean hasLunchBreak) {
			super(teams, venue, date, umpire);
			this.days = days;
			this.oversPerDay = oversPerDay;
			this.hasLunchBreak = hasLunchBreak;
		}// constructors ends here
		
		void display() {
			super.display(); 
				System.out.println("Total days : "+this.days);
				System.out.println("Overs Per Day : "+this.oversPerDay);
				System.out.println("Lunch  break : "+this.hasLunchBreak);
				
	}
		
		double approxMatchDuration() {
			return ((days*oversPerDay)+ 30)*4;
		}
		
	    
	  }// class TestMatch match ends here

	class OneDayMatch extends CricketMatch {
	    int overs;
	    int PPOvers;
	    boolean dayNight;
		public int getOvers() {
			return overs;
		}
		void setOvers(int overs) {
			this.overs = overs;
		}
		 int getPPOvers() {
			return PPOvers;
		}
		void setPPOvers(int pPOvers) {
			PPOvers = pPOvers;
		}
		boolean isDayNight() {
			return dayNight;
		}
		void setDayNight(boolean dayNight) {
			this.dayNight = dayNight;
		}//getters and setters ends here
		
		public OneDayMatch(String teams, String venue, String date, String umpire, int overs, int pPOvers,
				boolean dayNight) {
			super(teams, venue, date, umpire);
			this.overs = overs;
			PPOvers = pPOvers;
			this.dayNight = dayNight;
		}
		
		OneDayMatch() {
			super();
			this.overs = 50;
			this.PPOvers = 10;
			this.dayNight = true;
		}// constructors ends here
		
		void display() {
			super.display(); 
				System.out.println("Total Overs : "+this.overs);
				System.out.println("PP Overs : "+this.PPOvers);
				System.out.println("Timing : "+this.dayNight);
				
	}// class OneDay match ends here
		
		double approxMatchDuration() {
			return (this.overs*2)*4;
		}
		
	}

	class T20Match extends CricketMatch {
	    int overs;
	    int PPOvers;
	    int timeOuts;
	    boolean hasCheerLeaders;
	    
		int getOvers() {
			return overs;
		}
		void setOvers(int overs) {
			this.overs = overs;
		}
		int getPPOvers() {
			return PPOvers;
		}
		void setPPOvers(int pPOvers) {
			PPOvers = pPOvers;
		}
		int getTimeOuts() {
			return timeOuts;
		}
		void setTimeOuts(int timeOuts) {
			this.timeOuts = timeOuts;
		}
		 boolean isHasCheerLeaders() {
			return hasCheerLeaders;
		}
		void setHasCheerLeaders(boolean hasCheerLeaders) {
			this.hasCheerLeaders = hasCheerLeaders;
		}// getters and setters ends here
		
		T20Match(String teams, String venue, String date, String umpire, int overs, int pPOvers, int timeOuts,
				boolean hasCheerLeaders) {
			super(teams, venue, date, umpire);
			this.overs = overs;
			PPOvers = pPOvers;
			this.timeOuts = timeOuts;
			this.hasCheerLeaders = hasCheerLeaders;
		}
		
		T20Match() {
			super();
			this.overs = 20;
			PPOvers = 6;
			this.timeOuts = 2;
			this.hasCheerLeaders = true;
		}// constructors ends here
		
		void display() {
			super.display(); 
				System.out.println("Total Overs : "+this.overs);
				System.out.println("PP Overs : "+this.PPOvers);
				System.out.println("Timing : "+this.timeOuts);
				System.out.println("has Cheerleaders : "+this.hasCheerLeaders);
				
	}
	    
		double approxMatchDuration() {
			return ((this.overs*2)*4)+(this.timeOuts*2.50);
		}
	    
	}// class OneDay match ends here

	class TestCricketMatch {
	    public static void main(String[] args) {
	        CricketMatch[] crr = new CricketMatch[3];
	        
	        crr[0]=new T20Match();
	        crr[1]=new OneDayMatch("India VS Australia","Hobart","10 Nov 2025","Kumar Dharmsena",50,10,true);
	        crr[2]=new TestMatch("India VS South Africa","Hobart","10 Nov 2025","Kumar Dharmsena",5,90,true);
	        
	        for(int i=0;i<crr.length;i++) {
	        	crr[i].display();
	        	System.out.println("Approx Match Time :" +crr[i].approxMatchDuration()+"Minutes");

	        }
	        
	        
	        
	        
	    }
	}


