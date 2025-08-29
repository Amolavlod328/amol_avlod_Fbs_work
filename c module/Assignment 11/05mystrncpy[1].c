//mystrncpy user define function
#include<stdio.h>
#include<string.h>
void mystrncpy(char*,char*,int);

void main()
{
	char str[]="avlod";
	char brr[50];
	int n=3;
	mystrncpy(brr,str,n);
}
void mystrncpy(char* brr,char* str, int size)
{
	int i;
	for(i=0;i<size;i++)
	{
		brr[i]=str[i];
	}
	brr[i]='\0';
	puts(brr);
}
