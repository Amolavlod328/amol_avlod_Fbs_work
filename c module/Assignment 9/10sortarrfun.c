#include<stdio.h>
void sortarrfun(int [],int ,int ,int );
void main()
{
	int arr[5]={60,50,40,20,10};
	int i,j,temp;
	
	sortarrfun(arr,i,j,temp);
}

void sortarrfun(int arr[],int i,int j,int temp)
{


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