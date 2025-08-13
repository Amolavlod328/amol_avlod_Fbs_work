//5. Write a menu driven program to take a number for user and perform operations as follows.
//
//Press 1.To check number is even or odd.
//2.To check number is prime or not.
//3.To check number is pallindrome or not.
//4.To check number is positive, negative or zero.
//5.To reverse a number.
//6.To find sum of digits.

#include<stdio.h>
void menudriven(int,int);
void main()
{
	
	int choice,num;
	printf("enter a number :");
	scanf("%d",&num);
	printf("enter the choice: ");
	scanf("%d",&choice);
    menudriven(choice,num);
}

//start 
void menudriven(int choice,int num)
{
	
	
	

	
	//To check number is even or odd.
	
	if(choice==1){
		
		
		if(num%2==0){
			printf("even number");
		}
		else
		{
			printf("odd number");
		}
	}
	else   //To check number is prime or not.
	{
		if(choice==2){
			
			int flag=0,i=2;
			
			
		while(i<=num/2){
			if(num%i==0){
				flag=1;
				break;
			}
			i++;
		}
		if(flag==0){
			printf("the number is prime");
		}
		else
		{
			printf("the number is not prime");
		}
			
		}
		else //check number is pallindrome or not.
		{
			if(choice==3){
				
			int rev=0,temp;
			
			temp=num;
			
			while(num>0){
				rev=(rev*10)+num;
				num=num/10;
			}
			if(temp==rev){
				printf("the number is palindrom");
			}
			else
			{
				printf("the number is not palindrom");
			}
			}
			else //To check number is positive, negative or zero.
			{
				if(choice==4){
					
					
					
					if(num>0){
						printf("the number is positive");
					}
					else
					{
						if(num<0){
							printf("the number is negative");
						}
						else
						{
							printf("the number is zero");
						}
					}
				}
				else //To reverse a number.
				{
					if(choice==5){
						int rev=0;
						
						
						while(num>0){
							rev=(rev*10)+num%10;
							num=num/10;
						}
						printf("the reverse number is %d",rev);
					}
					else  //To find sum of digits.
					{
						if(choice==6){
							int num,sum=0,rem;
							printf("enter a number for sum of digits : ");
							scanf("%d",&num);
						
							
							while(num>0){
								rem=num%10;
								num=num/10;
								sum=sum+rem;
							}
							printf("the sum of digits is %d ",sum);
						}
					}
				}
				
			}
		}
	}
}

       // end the mainu driven program........