#include<stdio.h>
#include<string.h>
void main() {
	
	char str[20];
	char str2[20];

	printf("enter a string:");
	scanf("%s",&str);
	printf("enter a str2:");
	scanf("%s",&str2);
	int res= strcmp(str,str2);
	if(res==0)
	{
		printf("both are equal ");
	}
	else if(res>=0)
	{
		printf("str is greater");
	}
	else
	{
		printf("str2 is greater");
	}
}