#include<stdio.h>
int greatthree();
void main()
{
	int res=greatthree();
	if(res==0)
	{
		printf("a is greater");	
	}
	else if(res==1)
	{
      	printf("b is greater");
	}
}


int greatthree()
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
	  return 0;
		
	}
	else
	{
		if(b>c)
		{
			return 1;
			
		}
		else
		{
			printf("c is greater");
		}
	}
}
	