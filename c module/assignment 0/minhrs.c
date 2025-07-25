//Write a C program to convert given minutes into hours and remaining minutes.
#include<stdio.h>
void main(){

int min=130;
int hrs;
hrs=min/60;
min=min%60;
printf("hrs is %d min is%d",hrs,min);
}