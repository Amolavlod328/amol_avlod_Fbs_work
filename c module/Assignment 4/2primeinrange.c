//2.Print prime numbers in the given range 1 to n.
#include<stdio.h>
void main()
{
	int n;
	printf("enter the range:");
	scanf("%d",&n);
	for(int k=2;k<=n;k++)
	{
	
	
	int flag=1;
	for(int i=2;i<k;i++)
	{
		if(k%i==0)
		flag=0;
		
	}
	if(flag==1)
	printf("%d is prime\n",k);
}
//	else
//	printf("%d  is not prime",n);
}