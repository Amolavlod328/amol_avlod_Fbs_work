////Check the given number is prime or not.
//Input: n = 7
//Output: Prime
#include<stdio.h>
void main()
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
	printf("is prime");
	else
	printf("not prime");
	
}