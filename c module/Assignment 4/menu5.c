//1.To check number is even or odd.
//2.To check number is prime or not.
//3.To check number is pallindrome or not.
//4.To check number is positive, negative or zero.
//5.To reverse a number.
//6.To find sum of digits.
#include<stdio.h>
void main()
{
	
	int no;
	printf("enter the no:");
	scanf("%d",&no);
	
	
	if(no==1)
	{
	int n;
	printf("enter the no:");
	scanf("%d",&n);
	if(n%2==0)
	printf("%d is even",n);
	else
	printf("%d is odd",n);
}

	if(no==2)
	{
		int num,flag=1;
		printf("enter the no:");
	    scanf("%d",&num);
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			flag=0;
		}
	  	if(flag==1)
		printf("no is prime");
		else
		printf("no not is prime");
	}

else if(no==3)
{
	int no;
	printf("%d enter the no:",no);
	scanf("%d",&no);
	int temp=no,rev=0;
	while(temp>0)
	{
		int rem=temp%10;
		temp=temp/10;
		rev=rev*10+rem;
	}
if(rev==no){
	printf("%d is palindrome number",no);
}else{
	printf("%d is not  palindrome number",no);
}
}
    if(no==4)
    {
    	int no;
    	printf("enter the number:");
    	scanf("%d",&no);
    	if(no >0)
    	{
    		printf("%d number is positive",no);
		}
		else if(no<0)
		printf("%d number is negetive",no);
		else
		printf("%d is zero",no);
	}
	
	if(no==5)
	{
		int no;
		printf("enter the number:");
    	scanf("%d",&no);
	int r1,r2,r3,q1,rev;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	printf("rev=%d",rev);
	
		
	}
	if(no==6)
	{
	
	int no;
	printf("enter the digits:");
	scanf("%d",&no);
	int sum=0,r1;
	while(no!=0)
	{
	r1=no%10;
	no=no/10;
	sum=sum+r1;
}
    printf("sum of digits is %d ",sum);
}
}