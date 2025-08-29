//mystrcat user define function
#include<stdio.h>
#include<string.h>
void mystrcat(char*,char*);
void main()
{
	char str[50]="amol";
	char brr[50]="avlod";
	mystrcat(str,brr);
}
void mystrcat(char* str,char* brr){
int n=strlen(str);
	//printf("%d",n);
	for(int j=n,i=0;brr[i]!='\0';i++,j++){
		str[j]=brr[i];
	}
	puts(str);
}