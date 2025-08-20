#include<stdio.h>
void alternatefun(int [],int);
void main()
{
	int arr[5],i;
	printf("enter the elements:");
	for( i=0;i<5;i++)
	{
	scanf("%d",&arr[i]);
   }
   printf("the alternate no:");
   
   alternatefun(arr,i);
}
void alternatefun(int arr[],int i)
{

   for(i=0;i<5;i=i+2)
   {
   	printf("%d ",arr[i]);
   }
}