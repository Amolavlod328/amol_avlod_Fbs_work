//10. Write a C program to input marks of five subjects, find the total marks, and calculate
//the percentage.
#include<stdio.h>
void main(){
	float s1=100,s2=50.55,s3=100,s4=35,s5=100;
	float sum,per;
	sum=s1+s2+s3+s4+s5;
	per= (sum/500)*100;
	printf("per is %.2f",per);
		
}