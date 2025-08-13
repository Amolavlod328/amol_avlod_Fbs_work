#include<stdio.h>
int yer();
void main()
{
	int res=yer();
	if(res==1)
	{
	 printf("year is leap");
	}
}
 int yer()
 {
 
	int yr;
	printf("enter the year:");
	scanf("%d",&yr);
	if((yr%4==0 && yr%100!=0)||(yr%400==0)){
	return 0;
	}
	else{
		printf("year is not leap");
	}
}