#include<stdio.h>
int getstrong(int,int,int,int);
void main()
{
	int no,fact,digit=0,sum=0;
	int res=getstrong(no,digit,sum,fact);
	if(res==0)
	{
		printf("no is an strong number");
	}
	
}
 int getstrong(int no,int fact,int digit,int sum)
 {
 

	printf("Enter the number:");
	scanf("%d",&no);
	
	int temp=no;
	while(temp>0){
		
		digit=temp%10;
		fact=1;
		
		for(int i=1;i<=digit;i++){
			
			fact = fact*i;
		}
		sum=sum+fact;
		temp=temp/10;
	}

	if(no == sum){
		return 0;
		
	}else{
			printf("%d is not an strong number",no);
	}
	}