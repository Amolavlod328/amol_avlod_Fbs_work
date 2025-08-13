#include<stdio.h>
int findage(int);
void main()
{
	int age;
	 int res=findage(age);
	 if(res==0)
	 {
	 	printf("child");
	 }
	 else if(res==1)
	 {
	 	printf("teenager");
	 }
	 else if(res==2)
	 {
	 	printf("adult");
	 }
	 
	
}





int findage(int age)
{


	
	printf("enter the age:");
	scanf("%d",&age);
	if(age<12)
	{
		return 0;
	}
	else
	if(age >= 12 && age<= 19)
	{
		return 1;
	}
	else
	
	if(age>= 20 && age<= 59)
{
	return 2;
}
    else
    {
    	printf("senior");
	}
    
}
