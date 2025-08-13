#include<stdio.h>
void rangestrong(int);
void main()
{
	int num;
	rangestrong(num);
}
void rangestrong(int num)
{

	
	printf("enter the range:");
	scanf("%d",&num);
	
	for(int k=1;k<=num;k++)
	{
	
    int num=k,temp=num,sum=0;
    while(temp!=0)
    {
    	int r=temp%10;
    	int fact=1;
    	for(int i=1;i<=r;i++)
    	{
    	 fact=fact*i;
    }
    	  sum=sum+fact;
    	 temp=temp/10;
	}
	 if(sum==num)
	   printf("%d  is strong\n",num);
}
//	   else
//	   printf("no is not strong");
//}
 
      
	
}