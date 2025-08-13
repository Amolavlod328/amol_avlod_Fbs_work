#include<stdio.h>
int mark(int );
void main()
{
	
	int marks;
	int res=mark( marks);
	if(res==0)
	{
		printf("distinction");
	}
	else if(res==1)
	{
		printf("first class");
	}
	if(res==2)
	{
		printf("second class");
	}
	if(res==3)
	{
			printf("pass");
	}
	
	
	
	
	
}
int mark(int marks)
{

	
	printf("enter the marks:");
	scanf("%d",&marks);
	if(marks>=75)
	{
		return 0;
	}
	else
	if(marks>=65)
	{
		return 1;
	}
	if(marks>=55)
	{
		return 2;
		
	}
	else
	if(marks>=40)
	{
	    return 3;
		
	}
	else
	{
	printf("fail");	
	}
}