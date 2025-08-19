//10. Sort the array.
#include<stdio.h>
void main()
{
	int arr[5]={60,50,40,20,10};
	int i,j,temp;
	for( i=0;i<5-1;i++)
	{
		for( j=0;j<5-1;j++)
		{
		if(arr[j]>arr[j+1])
		{
		
		 temp=arr[j];
		    arr[j]=arr[j+1];
		   arr[j+1]=temp;
	    }
		}
	}
	for( i=0;i<5;i++)
	printf("%d ",arr[i]);
}