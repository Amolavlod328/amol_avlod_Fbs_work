#include<stdio.h>
void getprime(int);
void main() {
		int num;
	printf("Enter the number:");
	scanf("%d",&num);
	
	getprime(num);
	
	
}//main ends here

void getprime(int num){
	int isprime=1;
	for(int i=2;i<num;i++){
	
	if(num%i==0){
	isprime=0;
break;
	}
	
	}
	if(isprime==1){
		printf("No is prime");
	}else
	{
			printf("No is NOT prime");
	}
	
	
	
}