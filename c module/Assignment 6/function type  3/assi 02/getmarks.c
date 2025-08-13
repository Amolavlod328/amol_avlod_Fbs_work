#include<stdio.h>
int getmarks(int marks);
void main()
{
	int marks;
 getmarks( marks);
}
   int getmarks(int marks)
   {
   

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