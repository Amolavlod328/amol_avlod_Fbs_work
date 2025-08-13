#include<stdio.h>
void divisible();
void main()
{
	divisible();
}
void divisible()
{
	int num;
	printf("Enter the number:");
	scanf("%d",&num);
	if(num%3==0&&num%5==0){
		printf("Divisible by both");
	}else if(num%3==0&&num%5!=0){
		printf("divisible by 3 but not 5");
	}else if(num%5==0&&num%3!=0){
		printf("Divisible by 5 but not by 3");
	}else{
		printf("Divisible by  none");
	}
}