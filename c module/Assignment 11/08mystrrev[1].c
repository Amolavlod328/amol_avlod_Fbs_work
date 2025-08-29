//mystrrev user define function
#include<stdio.h>
#include<string.h>
void mystrrev(char*);
void main()
{
	char str[]="first";
	mystrrev(str);
	puts(str);
}
void mystrrev(char* str)
{
int res=strlen(str);
	printf("%d",res);
	int i,j;
	for(i=0,j=res-1;i<j;i++,j--)
	{
		int temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}
	
}