#include<stdio.h>
int amongt(int ,int ,int );
void main()
{
	int a,b,c;
	amongt( a, b,c);
}
  int amongt(int a,int b,int c)
  {
  
	
	printf("enter the number of a:");
	scanf("%d",&a);
	printf("enter the number of b:");
	scanf("%d",&b);
	printf("enter the number of c:");
	scanf("%d",&c);
	if(a>b&&a>c)
	{
		
		printf("a is greater");
	}
	else
	{
		if(b>c&&b>a)
		{
			printf("b is greater");
			
		}
		else
		{
			printf("c is greater");
		}
	}
}
