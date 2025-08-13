#include<stdio.h>
void main()
{
	int no=15;
//	printf("enter the range");
//	scanf("%d",&no);
	for(int j=10;j<=no;j++)
	{
		printf("\n");
	for(int i=1;i<=j;i++)
	{
		if(j%i==0)
		{
			printf("%d ",i);
		}
	}
}
}