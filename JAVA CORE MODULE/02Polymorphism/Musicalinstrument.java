
package Polymorphism02;

import java.util.*;

public class Musicalinstrument {
	
	String name;
	String type;
	int volumelevel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getVolumelevel() {
		return volumelevel;
	}
	public void setVolumelevel(int volumelevel) {
		this.volumelevel = volumelevel;
	}
	
	public Musicalinstrument() {
		
		this.name = "guitar";
		this.type = "String";
		this.volumelevel = 7;
	}
	
	public Musicalinstrument(String name, String type, int volumelevel) {
		
		this.name = name;
		this.type = type;
		this.volumelevel = volumelevel;
	}

	void display() {
		System.out.println("instrument name is: "+this.name);
		System.out.println("instrument type is: "+this.type);
		System.out.println("instrument volumelevel: "+this.volumelevel);
	}
	
	 void  playmusic(int a) {
		 
		 int d=1;
		 if(d==a) {
			System.out.println("playing my favourite song's only music");
			System.out.println("and favourite song is Dooron Dooron by paresh pahuja");
		 }
			else {
				System.out.println("playing your favourite song's only music");
			}
		
		 }
		 
	 
}// class instrument ends

class Guitar extends Musicalinstrument{
	int numberofstring;
	String haspick;
	
	
	public int getNumberofstring() {
		return numberofstring;
	}
	public void setNumberofstring(int numberofstring) {
		this.numberofstring = numberofstring;
	}
	public String getHaspick() {
		return haspick;
	}
	public void setHaspick(String haspick) {
		this.haspick = haspick;
	}
	
 void  playmusic(int a) {
		 
		 int d=1;
		 if(d==a) {
			System.out.println("playing my favourite song with Guitar ");
			System.out.println("and favourite song is Dooron Dooron by paresh pahuja");
		 }
			else {
				System.out.println("playing your favourite song with Guitar vibe");
			}
		
		 }
	public Guitar() {
		super();
		this.numberofstring = 7;
		this.haspick = "true";
	}
	
	 Guitar(String name, String type, int volumelevel,int numberofstring, String haspick) {
		super(name,type,volumelevel);
		this.numberofstring = numberofstring;
		this.haspick = haspick;
	}
	
	 void display() {
		 super.display();
		 System.out.println("no of String is: "+this.numberofstring);
		 System.out.println("is this haspick: "+this.haspick);
	 }
	
	
}// class guitar ends
   
class Fluite extends Musicalinstrument{
	
	int numberofholes;
	String material;
	public int getNumberofholes() {
		return numberofholes;
	}
	public void setNumberofholes(int numberofholes) {
		this.numberofholes = numberofholes;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public Fluite() {
		super();
		this.numberofholes = 8;
		this.material = "Bamboo";
	}
	
	public Fluite(String name, String type, int volumelevel,int numberofholes, String material) {
		super(name,type,volumelevel);
		this.numberofholes = numberofholes;
		this.material = material;
	}
	
 void  playmusic(int a) {
		 
		 int d=1;
		 if(d==a) {
			System.out.println("playing my favourite song with Fluite vibe");
			System.out.println("and favourite song is Dooron Dooron by paresh pahuja");
		 }
			else {
				System.out.println("playing your favourite song with Fluite vibe");
			}
		
		 }
	
	void display() {
		super.display();
		System.out.println("no of holes in fluite: "+this.numberofholes);
		System.out.println("material: "+this.material);
	}
	
}//Fluite class ends
class Drum extends Musicalinstrument{
	    String diameter;
	    int noofstick;
	    String iselectronic;
		public String getDiameter() {
			return diameter;
		}
		public void setDiameter(String diameter) {
			this.diameter = diameter;
		}
		public int getNoofstick() {
			return noofstick;
		}
		public void setNoofstick(int noofstick) {
			this.noofstick = noofstick;
		}
		public String getIselectronic() {
			return iselectronic;
		}
		public void setIselectronic(String iselectronic) {
			this.iselectronic = iselectronic;
		}
		
		 void  playmusic(int a) {
			 
			 int d=1;
			 if(d==a) {
				System.out.println("playing my favourite song with Drum");
				System.out.println("and favourite song is Dooron Dooron by paresh pahuja");
			 }
				else {
					System.out.println("playing your favourite song with Drum");
				}
			
			 }
		
		public Drum() {
			super();
			this.diameter = "4 inch";
			this.noofstick = 2;
			this.iselectronic = "false";
		}
		public Drum(String name, String type, int volumelevel,String diameter, int noofstick, String iselectronic) {
			super(name,type,volumelevel);
			this.diameter = diameter;
			this.noofstick = noofstick;
			this.iselectronic = iselectronic;
		}
		
		void display() {
			System.out.println("diameter of drum: "+this.diameter);
			System.out.println("no of stick avail" +this.noofstick);
			System.out.println("is electric: " +this.iselectronic);
			
		}
	    
	
}// drum class ends

class Testinstrument{
	public static void main(String[] args) {
		
		Musicalinstrument e1=new Musicalinstrument();
		
		Scanner Sc=new Scanner(System.in);
		
		e1=new Guitar("piano","typing",5,7,"true");
		e1.display();
		
		System.out.println("-------------------------------------------");
		System.out.println("enter 1 to play my fauvorite song ");
		System.out.println("enter 2 to play your favourite song ");
		
		int a=Sc.nextInt();
		
	
			e1.playmusic(a);
		
			Guitar g1=new Guitar();
			g1.playmusic(a);
		
			Drum d1=new Drum();
			d1.playmusic(a);
   
    
			Fluite f1=new Fluite();
	        f1.playmusic(a);
	
	
		
		
		
		
	}
}
