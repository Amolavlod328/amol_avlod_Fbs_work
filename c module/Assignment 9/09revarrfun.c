#include<stdio.h>
void revarrfun(int []);
void main()
{
     int arr[5]={10,20,30,40,50};
     
	 revarrfun( arr);
}

   void revarrfun(int arr[])
   {
   	
   for(int i=4;i>=0;i--)
	{
		printf("%d ",arr[i]);
	}
	
	
}