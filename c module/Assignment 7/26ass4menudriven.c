#include<stdio.h>
void MenuDriven(int* , int *);
void main(){
	printf("<------------Menu Card---------->\n");
	printf("Enter 1----->Even or odd\n");
	printf("Enter 2----->Prime or Not\n");
	printf("Enter 3----->Pallindrome or Not\n");
	printf("Enter 4----->Positive negative or zero \n");
	printf("Enter 5----->Reverse a Number \n");
	printf("Enter 6----->Sum of digits \n \n ");
	int choice;
	int no;
		printf("Enter the Number:");
		scanf("%d",&no);
		printf("Enter your choice code:");
		scanf("%d",&choice);
    MenuDriven(&no,&choice);
}//main end

void MenuDriven(int* no, int *choice){
	int sum=0;
		if(*choice==1){
		
		if(*no%2==0)
		
			printf("%d is Even",*no);
			else
		     printf("%d is Odd",*no);
		}
		else if(*choice==2){
		
		int i=2,isprime=1;
		while(i<*no){
			if(*no%i==0)
		isprime=0;
			i++;
		}
		if(isprime==1)
		printf("%d is prime",*no);
		else
		printf("%d Not prime",*no);
		
	}else if(*choice==3){
		int temp=*no;
		while(*no>0){
			int rem=*no%10;
			sum=sum*10+rem;
			*no=*no/10;	
		}
		if(sum==temp)
		printf("%d is an pallindrome number",temp);
		else
			printf("%d is Not an pallindrome number",temp);
	}else if(*choice==4)	{
	
		if(*no>0)
		printf("%d is positive Number",*no);
		else if(*no<0)
		printf("%d is Negative Number",*no);
		else
		printf("%d is zero",*no);
	}	else if(*choice==5){
	
		int temp=*no;
		while(*no>0){
			int rem=*no%10;
			sum=sum*10+rem;
			*no=*no/10;
			
		}printf("%d Reverse is %d",temp,sum);
		
	}else if(*choice==6){
	
		int temp=*no;
		while(*no>0){
			int rem;
			rem=*no%10;
			sum=sum+rem;
			*no=*no/10;
			
			
		}printf("%d's sum of digits %d",temp,sum);
	}else
	printf("Invalid Choice");
	
}