#include<stdio.h>
#include<string.h>
void main() {
	
	char str[20];
	char str2[20];
	int n;

	printf("enter a string:");
	scanf("%s",&str);
	printf("enter a str2:");
	scanf("%s",&str2);
	printf("enter a n number:");
	scanf("%d",&n);
	
	int res= strncmp(str,str2,n);
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