//Write a program to check whether a given year is a leap year.
#include<stdio.h>
void main(){
	int yr;
	printf("enter the year:");
	scanf("%d",&yr);
	if((yr%4==0 && yr%100!=0)||(yr%400==0)){
		printf("year is leap");
	}
	else{
		printf("year is not leap");
	}
}