#include<stdio.h>
void evenoddfun(int [],int);
void main() 
{

	int arr[5]= {2,3,4,5,6};
	int i;
	printf("elements in array: ");
																
	for(int i=0; i<5; i++) {
		printf("%d ",arr[i]);
	}
	printf("\n");
	evenoddfun( arr,i);
}
	void evenoddfun(int arr[],int i)
	{
	
	
	for(i=0; i<5; i++)
	{
	 if(arr[i]%2==0)
		{
			printf(" even Arr[%d] = %d  \n",i,arr[i]);
}
}
        
			for(i=0; i<5; i++)
	       {
		 if (arr[i]%2!=0)
		{
		printf(" odd Arr[%d] = %d  \n",i,arr[i]);

		}
}
}
