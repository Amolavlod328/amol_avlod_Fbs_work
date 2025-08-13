#include<stdio.h>
int getsum();
void main()
{
	getsum();
}
    int getsum()
    {
	
	int i=12345;
	int sum=0,r1;
	while(i>0)
	{
		r1=i%10;
		i=i/10;	
		sum=sum+r1;	
	}
	printf("%d",sum);
}