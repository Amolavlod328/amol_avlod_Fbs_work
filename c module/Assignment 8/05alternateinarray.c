//5. Print alternate elements in array.
#include<stdio.h>
void main()
{
	int arr[5],i;
	printf("enter the elements:");
	for( i=0;i<5;i++)
	{
	scanf("%d",&arr[i]);
   }
   printf("the alternate no:");
   for(i=0;i<5;i=i+2)
   {
   	printf("%d ",arr[i]);
   }
}