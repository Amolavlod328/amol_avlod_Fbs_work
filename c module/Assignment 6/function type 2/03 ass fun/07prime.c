#include<stdio.h>
int getprime();
void main()
{
	int res=getprime();
	if(res==0)
	{
		printf("is prime");
	}
}
 int getprime()
 {
 
	int n ,i=2,isprime=1;
	printf("enter the number:");
	scanf("%d",&n);
	while(i<=n-1)
	{
		if(n%i==0)
		isprime=0;
		i++;
	}
	if(isprime==1)
	return 0;
	else
	printf("not prime");
	
}