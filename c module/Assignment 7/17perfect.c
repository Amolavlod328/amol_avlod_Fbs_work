#include<stdio.h>
void getperfect(int*);
void main() {
	int num;
	
	printf("Enter the number:");
	scanf("%d",&num);
	 getperfect(&num);
	
}//main end here

void getperfect(int* num){
	int temp=*num;
	int i=1,sum=0;
	while(i<=*num/2){
		
		if(*num%i==0){
			sum=sum+i;
		}i++;
		
	}
	if(sum==temp)
	printf("No is perfect");
	else
		printf("No is not perfect");
}