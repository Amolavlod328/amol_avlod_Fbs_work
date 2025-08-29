//mystrlower user define function
#include<stdio.h>
#include<string.h>
void mystlower(char*);

void main()
{
	char str[]="AVLOD";
	mystlower(str);
}
void mystlower(char* str)
{
	for(int i=0;str[i]!='\0';i++)
	{
		str[i]=str[i]+32;
	}
	puts(str);
}