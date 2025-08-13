#include<stdio.h>
int getprime();
void main()
{
	getprime();
}
 int getprime()
 {
 
	int n=13;
for(int k=2;k<=n;k++){
	n=k;
	int i=2,isprime=1;
//	printf("enter the number:");
//	scanf("%d",&n);
	while(i<=n)
	{
		if(n%i==0)
		isprime=0;
		i++;
	}

	if(isprime==1)
	printf("%d is prime\n",n);
}

//	else
//	printf("not prime");
//	
	
}