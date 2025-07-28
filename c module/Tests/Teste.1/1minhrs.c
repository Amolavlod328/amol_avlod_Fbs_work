#include<stdio.h>
void main(){
	int hrs=1,min=1,sec=30;
	sec=(hrs*3600)+(min*60)+(sec);
	printf("total sec is %d", sec);
}