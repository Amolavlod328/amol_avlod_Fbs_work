#include<stdio.h>
void getfactorial(int);
void main() {
	int no;
	printf("Enter the number:");
	scanf("%d",&no);
	
	getfactorial(no);
	
}//main end 


void getfactorial(int num){
	int i=1,fact=1;
	while(i<=num) {
		fact=fact*i;
		i++;

	}
printf("Fact = %d",fact);
} // end getfactorial