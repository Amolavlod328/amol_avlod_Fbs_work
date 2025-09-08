//10. Sort the array.
#include<stdio.h>
void main()
{
	int* ptr=(int*) malloc(5*sizeof(int));
	ptr[0]=19;
	ptr[1]=11;
	ptr[2]=190;
	ptr[3]=14;
	ptr[4]=15;
	int i,j,temp;
	for( i=0;i<5-1;i++)
	{
		for( j=0;j<5-1;j++)
		{
		if(ptr[j]>ptr[j+1])
		{
		
		 temp=ptr[j];
		    ptr[j]=ptr[j+1];
		   ptr[j+1]=temp;
	    }
		}
	}
	
	
	
	for( i=0;i<5;i++)
	printf("%d ",ptr[i]);
}