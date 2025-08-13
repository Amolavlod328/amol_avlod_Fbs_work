#include<stdio.h>
int triangle();
void main()
{

	
	
	int rec=triangle();
	if(rec==0)
	{
	printf("triangle is equaletral");
   }
   else if(rec==1)
   {
   		printf("triangle is isosceles ");
   }
   else
   {
   	printf("triangle is scalene ");	
   }
}
   
	 int triangle()
 {
 
 
	int a=4,b=6,c=6;
	if(a==b&&b==c){
		return 0;
	}
	else
	{
		if(a==b||b==c||c==a)
	{
		return 1;
	}
	else
	{
	    return 2;	
	}
	}
	
}