#include<stdio.h>
#include<string.h>
void main() {
	char str[20];
	char str2[20];
	printf("enter a string:");
	scanf("%s",&str);
	printf("enter a str2:");
	scanf("%s",&str2);
	strcat(str,str2);
	printf("str= %s:\n",str);
	printf("str2=  %s:",str2);
}