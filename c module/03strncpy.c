#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	char temp[20];
    int n;
	printf("enter the char:");
	scanf("%[^\n]s",&str);
	printf("enter the n:");
	scanf("%d",&n);
	printf("before cpy %s\n",str);
	strncpy(temp,str,n);
	printf("after cpy %s",temp);
	
	
}
	
	                              
	
	
	
  