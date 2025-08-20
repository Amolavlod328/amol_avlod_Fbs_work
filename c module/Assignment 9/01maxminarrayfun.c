#include<stdio.h>
maxminarr(int [] );
void main()
{
		int arr[5];
    	printf("enter the elements: ");
		for(int i=0;i<5;i++)
	{
		scanf(" %d",&arr[i]);
	}
		maxminarr(arr);
}

   int maxminarr(int arr[])
{
	
	printf("\n");
	int max=arr[0];
	for(int i=1;i<5;i++)
	{
		if(arr[i]>max)
		max=arr[i];
	}
	printf("maximum num from element: %d\n",max);
	for(int i=0;i<5;i++)
	{
		if(arr[i]<max)
		max=arr[i];
	}
		printf("minimum num from element: %d ",max);
}