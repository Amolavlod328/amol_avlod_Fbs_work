#include<stdio.h>
void main()
{
	int arr[5];
	int max,max2;
	int i;
	for(i=0;i<5;i++)
	{
		printf("enter the index [%d]:",i);
		scanf("%d",&arr[i]);
	}
	max=arr[0];
	for( i=0;i<5;i++)
	
	{
		if(arr[i]>max)
		max=arr[i];
		
	}
	max2=arr[i];
	for(int i=0;i<5;i++)
	{
		if(arr[i]>max2&&arr[i]!=max)
	     max2=arr[i];
		
	}
	printf(" the greatest two no is: %d %d",max,max2);
	
}