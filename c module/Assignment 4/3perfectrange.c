//3. Print perfect numbers in the given range 1 to n.
#include<stdio.h>
void main()
{
	int n;
	printf("enter the range:");
	scanf("%d",&n);
	for(int k=1;k<=n;k++)
	{
	
	int sum=0;
	for(int i=1;i<k;i++)
	{
	
	 if(k%i==0)
	 sum=sum+i;
    }
    if(sum==k)
    printf("%d is perfect no\n",k);
//    else
//    printf("%d is not perfect no",n);
}
}