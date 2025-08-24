#include<stdio.h>
#include<string.h>
void main()
{
	char *str="firstbit";
	char ch='s';
	char res=strchr(str,ch);
	printf("%ld",res);
	
}