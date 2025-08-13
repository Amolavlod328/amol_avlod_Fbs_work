#include<stdio.h>
void rangearm(int);
void main()
{
	 int num;
	 rangearm(num);
}
    void rangearm(int num)
    {
	

	printf("enter the range:");
	scanf("%d",&num);
	for(int k=1;k<=num;k++)
	{
	
	int no=k,count=0,r,p,sum=0;
	int temp=no;

	
	while(temp!=0)
	{
	    count++;
	    temp=temp/10;
	}
	    temp=no;
     while(temp!=0)
	     {
	      r=temp%10;
	      p=1;
	     for(int i=1;i<=count;i++)
	     {
	     p = p * r;
	 }
	 
	     sum=sum+p;
	     temp=temp/10;
	    }
	    if(sum==no)
    printf("%d is armstrong\n",no);
}
//	    else
//	    printf("no is not armstrong\n");
}
	