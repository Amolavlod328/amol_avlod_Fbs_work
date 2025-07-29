//Write a program to check whether a number is even or odd.
#include<stdio.h>
void main(){
	int a;
	printf("enter the number a:");
	scanf("%d",&a);
	if(a%2==0){
		printf("numer is even");
	}
	else{
		printf("number is odd");
	}
}