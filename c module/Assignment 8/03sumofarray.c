//3. Find sum of all numbers.
#include<stdio.h>
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
	 printf("sum of elements is: ");
	 for(int i=0;i<5;i++)
	 {
	 	sum=sum+arr[i];
	 	
		 }	
		 printf("%d",sum);
}