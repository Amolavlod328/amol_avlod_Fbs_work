package inheritance01;

public class Student {
	int fbsid;
	String name;
	int distance;
	static int count=0;
	
	
	void setfbsid(int fbsid) {
		this.fbsid=fbsid;
	}
	void setname(String name) {
		this.name=name;
	}
    void setdis(int distance) {
    	this.distance=distance;
    
    }
    
   int getfbsid() {
		return this.fbsid;
	}
	String getname() {
		return this.name;
	}
    int getdis() {
    	return this.distance;
    
    }
    
    Student(){
    	this.fbsid=101;
    	this.name="amol";
    	this.distance=10;
    	this.count++;
    	System.out.println("default constructor called");
    }
    
    Student(int i,String n,int d){
    	this.fbsid=i;
    	this.name=n;
    	this.distance=d;
    	count++;
    	System.out.println("parameterized called");
    }
    
      static int getcount() {
    	  return count;
      }
      
      void display() {
    	  System.out.println("fbsid is: "+this.fbsid);
    	  System.err.println("name is: "+this.name);
    	  System.out.println("distance is: "+this.distance);
      }
}// class student ends here

class Pstudent extends Student{ //step 1 using extends keyword
	// step 2 remove state and behaviior
	    String cname;
	    String desig;
	    
	    void setcname(String cname) {
	    	this.cname=cname;
	    }
	    
	    void setdesig(String desig) {
	    	this.desig=desig;
	    }
	    
	    String getcname() {
	    	return this.cname;
	    }
	    
	    String getdesig() {
	    	return this.desig;
	    }
	    
	    Pstudent(){
	    	super();//step 3a 
	    	this.cname="xys";
	    	this.desig="abx";
	    }
	    
	    Pstudent(String c,String d){
	    	super(fbsid,name,distance); //step 3b
	    	this.cname=c;
	    	this.desig=d;
	    }
	    
	    void display() {
	    	super.display();//step 4
	    	System.out.println("cname is: "+this.cname);
	    	System.out.println("desig is: "+this.desig);
	    	
	    }
}// Pstudent ends

class TestSPtudent{
	public static void main(String []args) {
		
		Student s1=new Student();
		System.out.println("count is: "+Student.getcount());
		s1.display();
		Pstudent p1=new Pstudent();
		System.out.println("count is: "+Pstudent.getcount());
		p1.display();
	}
}
