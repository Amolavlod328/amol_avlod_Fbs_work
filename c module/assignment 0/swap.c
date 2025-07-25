//Write a C program to swap two numbers using a temporary third variable.
#include<stdio.h>
void main(){
	int a,b,temp;
	printf("before swap a= ",a);
	scanf("%d/n",&a);
	printf("before swap b= ",b);
	scanf("%d/n",&b);
	temp=a;
	a=b;
	b=temp;
	printf("after swap of a= %d b= %d",a,b);
	
}