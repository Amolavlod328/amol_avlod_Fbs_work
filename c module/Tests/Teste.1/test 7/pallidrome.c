#include<stdio.h>
int revarray(int[],int);
void main()
{
	int arr[]={1,2,5,2,1};
	int size = sizeof(arr)/sizeof(arr[0]);

     int res=revarray(arr,size);
     if(res==0)
     {
     	printf("palli");
	 }
	 else
	 {
	 	printf("not palli");
	 }
     
     
}

int revarray(int arr[],int size)
{
	int flag=0;
	for(int i=0;i<size-1;i++)
	{
	   if	(arr[i]!=arr[size-1-i])
	         flag=1;
	         break;
	}
	return flag;
	

	
}