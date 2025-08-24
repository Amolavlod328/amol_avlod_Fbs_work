#include<stdio.h>
#include<string.h>
void main() {
	char str[20];
	char str2[20];
	int n=3;
	printf("enter a string:");
	scanf("%s",&str);
	printf("enter a str2:");
	scanf("%s",&str2);
	strncat(str,str2,n);
	printf("str= %s:\n",str);
	printf("str2=  %s:\n",str2);
	printf("str2=  %d:",n);
}