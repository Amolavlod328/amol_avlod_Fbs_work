#include<stdio.h>
int getage(int age);
void main()
{
	int age;
	 getage( age);
	
}
 int getage(int age)
 {
 
	
	printf("enter the age:");
	scanf("%d",&age);
	if(age<12)
	{
		printf("child");
	}
	else
	if(age >= 12 && age<= 19)
	{
		printf("teenager");
	}
	else
	
	if(age>= 20 && age<= 59)
{
	printf("adult");
}
    else
    {
    	printf("senior");
	}
    
}