//Write a program to find greatest of three numbers using nested if-else.
#include<stdio.h>
void main()
{
	int a,b,c;
	printf("enter the number of a:");
	scanf("%d",&a);
	printf("enter the number of b:");
	scanf("%d",&b);
	printf("enter the number of c:");
	scanf("%d",&c);
	if(a>b)
	{
		printf("a is greater");
		
	}
	else
	{
		if(b>c)
		{
			printf("b is greater");
			
		}
		else
		{
			printf("c is greater");
		}
	}
}
	