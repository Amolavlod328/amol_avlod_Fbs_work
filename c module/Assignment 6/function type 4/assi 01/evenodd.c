#include<stdio.h>
int getevenodd(int);
void main()
{
		int a;
	int res=getevenodd(a);
	if(res==0)
	{
		printf("numer is even");
	}
	else
	{
		printf("numer is odd");
	}
	
}
int getevenodd(int a)
{


	printf("enter the number a:");
	scanf("%d",&a);
	if(a%2==0){
		return 0;
	}
	else{
	return 1;
	}
}