#include<stdio.h>
void main()
{
	int arr[]={11,23,30,4,21,45,50};
	int temp,count=0;
	for(int i=0;i<7;i++)
	{
		count=i;
	}
	printf("count: %d\n",count);
	for(int i=0;i<7;i++)
	{
	temp=arr[2];
	arr[2]=arr[4];
	arr[4]=temp;
}
	
	for(int i=0;i<7;i++)
	{
		printf("%d ",arr[i]);
	}
	
	
}