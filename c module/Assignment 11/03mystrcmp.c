//mystrcmp user define function
#include<stdio.h>
#include<string.h>
int mystrcmp(char*,char*);
void main()
{
	char str[30]="amol";
	char brr[30]="avlod";
int res=mystrcmp(str,brr);
	if(res==1){
		printf("brr is greater");
	}
	else if(res==-1){
		printf("str is greate");
	}
	else
	{
		printf("both are same");
	}

}
int mystrcmp(char* str,char* brr){
	int i=0;
	while(str[i]!='\0'||brr[i]!='\0'){
		if(str[i]<brr[i]){
			return 1;
		}
		else if(str[i]>brr[i]){
				return -1;
		}
		i++;
	}
	return 0;

}