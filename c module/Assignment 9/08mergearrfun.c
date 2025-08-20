#include<stdio.h>
 void mergearrfun(int [],int [],int []);
void main()
{
	int arr[5];
	int brr[5];
	int crr[10];
	printf("elements of arr:");
	for(int i=0;i<5;i++)
	{
		scanf(" %d",&arr[i]);
	}
		printf("\n");
		printf("elements of brr:");
	for(int i=0;i<5;i++)
	{
		scanf(" %d",&brr[i]);
	}
	printf("\n");
	
	 mergearrfun( arr, brr, crr);
}


 void mergearrfun(int arr[],int brr[],int crr[])
 
 {
 

	int i;
	for( i=0;i<5;i++)
	{
		crr[i]=arr[i];
}
	for( int j=0;j<5;j++)
	{
		crr[i]=brr[j];
		i++;
	}
     printf("elements of crr:[ ");
	for( i=0;i<10;i++)
	printf(" %d,",crr[i]);
	
printf("\b ]");	
}
