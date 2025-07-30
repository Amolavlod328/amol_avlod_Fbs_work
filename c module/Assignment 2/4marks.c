//Ask the user to enter marks.
#include<stdio.h>
void main()
{
	int marks;
	printf("enter the marks:");
	scanf("%d",&marks);
	if(marks>=75)
	{
		printf("distinction");
	}
	else
	if(marks>=65)
	{
		printf("first class");
	}
	if(marks>=55)
	{
		printf("second class");
		
	}
	else
	if(marks>=40)
	{
		printf("pass");
		
	}
	else
	{
	printf("fail");	
	}
}