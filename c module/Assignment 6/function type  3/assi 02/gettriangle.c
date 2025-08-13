#include<stdio.h>
 int gettriangle( int ,int ,int );
void main()
{
	int a=4,b=5,c=5;
	  gettriangle(  a, b,c);
	
}
 int gettriangle( int a,int b,int c)
 {
 
	
	if(a==b&&b==c){
		printf("triangle is equaletral");
	}
	else
	{
		if(a==b||b==c||c==a)
	{
		printf("triangle is isosceles ");
	}
	else
	{
	    printf("triangle is scalene ");	
	}
	}
	
}