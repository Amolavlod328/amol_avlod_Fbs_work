//7. Time (hour, min, sec)
#include<stdio.h>
struct Time
{
	int hrs;
	int min;
	int sec;
};
void main()
{
	struct Time t1,t2;
	
	t1.hrs=2;
	t1.min=30;
	t1.sec=56;
	
	printf("hours is =:%d\n min is =%d\n sec= %d",t1.hrs,t1.min,t1.sec);
	
		printf("\n enter the hrs ");
	scanf("%d",&t2.hrs);
	printf(" enter the min");
	scanf("%d",&t2.min);
	printf(" enter the sec");
	scanf("%d",&t2.sec);
	
	printf("hours is =:%d\n min is =%d\n sec= %d",t2.hrs,t2.min,t2.sec);
	
}