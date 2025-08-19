//4. Find odd and even among the numbers.
#include<stdio.h>
void main() {
	int arr[5]= {2,3,4,5,6};
	int i;
	printf("elements in array: ");
																
	for(i=0; i<5; i++) {
		printf("%d ",arr[i]);
	}
	printf("\n");
	
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
