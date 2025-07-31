//Sum of numbers in given range.
//Find sum of numbers from start to end.
//Input: start = 1, end = 5
//Output: 15
#include<stdio.h>
void main()
{
	int i=12345;
	int sum=0,r1;
	while(i>0)
	{
		r1=i%10;
		sum=sum+r1;
		i=i/10;	
	}
	printf("%d",sum);
}