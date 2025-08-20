#include<stdio.h>
void sumarrfun(int [],int );
void main()
{
	 int arr[5];
     int sum=0;
     printf("enter the elements: ");
     for(int i=0;i<5;i++)
     {
     	scanf("%d",&arr[i]);
	 }
	 printf("\n");
	 sumarrfun( arr, sum);
	
	
}

void sumarrfun(int arr[],int sum)
{

    
	 printf("sum of elements is: ");
	 for(int i=0;i<5;i++)
	 {
	 	sum=sum+arr[i];
	 	
		 }	
		 printf("%d",sum);
}