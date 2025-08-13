#include<stdio.h>
int getperfect(int);
void main() {
	int num;
	
	printf("Enter the number:");
	scanf("%d",&num);
	if(getperfect(num)==num)
	printf("Number is perfect");
	else
		printf("Number is not perfect");
	
}//main end here

int getperfect(int num){
	int i=1,sum=0;
	while(i<=num/2){
		
		if(num%i==0){
			sum=sum+i;
		}i++;
		
	}return sum;
}
