#include<stdio.h>
#include<string.h>
void main()
{
	char str[50];
	printf("enter a string:");
    scanf("%s",&str);
	strlen(str);
	printf("the char is : %s \n",str);
	printf(" the length is %d",strlen(str));
}