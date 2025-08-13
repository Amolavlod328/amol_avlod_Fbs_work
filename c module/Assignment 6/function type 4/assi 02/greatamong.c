#include<stdio.h>
int greatthree(int ,int ,int );
void main()
{
	int a,b,c;
	int res=greatthree( a,b, c);
	if(res==0)
	{
		printf("a is greater");	
	}
	else if(res==1)
	{
      	printf("b is greater");
	}
}


int greatthree(int a,int b,int c)
{

	
	printf("enter the number of a:");
	scanf("%d",&a);
	printf("enter the number of b:");
	scanf("%d",&b);
	printf("enter the number of c:");
	scanf("%d",&c);
	if(a>b&&a>c)
	{
	  return 0;
		
	}
	else
	{
		if(b>c&&b>a)
		{
			return 1;
			
		}
		else
		{
			printf("c is greater");
		}
	}
}
	