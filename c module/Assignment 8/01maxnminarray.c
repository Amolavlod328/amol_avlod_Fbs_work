//1. Find minimum and maximum number in array.
#include<stdio.h>
void main()
{
	int arr[5];
	int i;
	printf("enter the elements: ");
	for(i=0;i<5;i++)
	{
		scanf(" %d",&arr[i]);
	}
	printf("\n");
	int max=arr[0];
	for(i=1;i<5;i++)
	{
		if(arr[i]>max)
		max=arr[i];
	}
	printf("maximum num from element: %d\n",max);
	for(i=0;i<5;i++)
	{
		if(arr[i]<max)
		max=arr[i];
	}
		printf("minimum num from element: %d ",max);
}