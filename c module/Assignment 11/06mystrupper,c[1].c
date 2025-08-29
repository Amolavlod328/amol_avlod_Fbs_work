//mystrupper user define function
#include<stdio.h>
#include<string.h>
void mystrupper(char*);

void main()
{
	char str[]="avlod";
	mystrupper(str);
}
void mystrupper(char* str)
{
	int i;
	for( i=0;str[i]!='\0';i++){
		str[i]=str[i]-32;
	}
	printf("%s",str);
}
