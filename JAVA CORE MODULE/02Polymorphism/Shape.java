package Polymorphism02;

 class Shape {
			String color;
			int borderwidth;
			double Area;
			
			
			 String getColor() {
				return color;
			}
			 void setColor(String color) {
				this.color = color;
			}
			 int getBorderwidth() {
				return borderwidth;
			}
			 void setBorderwidth(int borderwidth) {
				this.borderwidth = borderwidth;
			}
			 
			 double calarea() {
				 return  Area;
			 }
			 
			 Shape() {
				super();
				this.color = "no color";
				this.borderwidth = 0 ;
			}
			 Shape(String color, int borderwidth) {
				
				this.color = color;
				this.borderwidth = borderwidth;
			}
			
			void display() {
				
				System.out.println("color is: "+this.color);
				System.out.println("border width: "+this.borderwidth);
				
			}
			
		}// class shape ends here

		class Circle extends Shape{
			double radius;

			 double getRadius() {
				return radius;
			}

			 void setRadius(double radius) {
				this.radius = radius;
			}
			 double calarea() {
				 return  Area=radius*radius;
			 }
			 
			   Circle() {
				super();
				this.radius = 0.0;
			}

			 Circle(String color, int borderwidth,double radius) {
				super(color,borderwidth);
				this.radius = radius;
			}
			
			void display() {
				super.display();
				System.out.println("radius is: "+this.radius);
				
			}
			
		}// class circle ends 

		class Rectangle extends Shape {
		    double length;
		    double width;

		    
		    double getLength() {
		        return length;
		    }
		    void setLength(double length) {
		        this.length = length;
		    }
		    double getWidth() {
		        return width;
		    }
		    void setWidth(double width) {
		        this.width = width;
		    }// Getters and Setters ends here
		    
		    double calarea() {
				 return  Area=length+width;
			 }

		    
		    Rectangle() {
		        super();
		        length = 0.0;
		        width = 0.0;
		    }//constructors ends here

		    Rectangle(String color, int borderWidth, double length, double width) {
		        super(color, borderWidth);
		        this.length = length;
		        this.width = width;
		    }

		    void display() {
		       
		        super.display();
		        System.out.println("Length : " + this.length);
		        System.out.println("Width : " + this.width);
		        System.out.println("----------------------------------");
		    }
		}//class rectangle ends here


		class Triangle extends Shape {
		    double base;
		    double height;

		    // Getters and Setters
		    double getBase() {
		        return base;
		    }
		    void setBase(double base) {
		        this.base = base;
		    }
		    double getHeight() {
		        return height;
		    }
		    void setHeight(double height) {
		        this.height = height;
		    }
		    
		    double calarea() {
				 return  Area=base*height;
			 }

		   
		    Triangle() {
		        super();
		        base = 0.0;
		        height = 0.0;
		    }

		    Triangle(String color, int borderWidth, double base, double height) {
		        super(color, borderWidth);
		        this.base = base;
		        this.height = height;
		    } // Constructors ends here

		    void display() {
		        
		        super.display();
		        System.out.println("Base : " + this.base);
		        System.out.println("Height : " + this.height);
		        System.out.println("----------------------------------");
		    }
		}//class triangle ends here


		class TestShape {
		    public static void main(String[] args) {
		        Circle c1 = new Circle("Red", 2, 5.5);
		        c1.display();

		        Rectangle r1 = new Rectangle("Blue", 3, 8.0, 4.0);
		        r1.display();

		        Triangle t1 = new Triangle("Green", 1, 6.0, 3.0);
		        t1.display();
		        
		        System.out.println("area is "+t1.calarea());
		    }
		}



