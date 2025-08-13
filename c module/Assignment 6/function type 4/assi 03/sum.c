#include<stdio.h>
int getsum(int,int);
void main()
{
	int i=12345,r1;
int	sum=getsum(i,r1);
	printf("%d",sum);
}

	int getsum(int i,int r1)
	{
	
	int sum=0;
	while(i>0)
	{
		r1=i%10;
		i=i/10;	
		sum=sum+r1;
	}
	
	return sum;
}