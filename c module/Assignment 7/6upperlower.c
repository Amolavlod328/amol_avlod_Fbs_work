#include<stdio.h>
char upperlowercase(char*);
void main(){
	char ch='T';
	upperlowercase(&ch);
	

}

char upperlowercase(char* ch){

	if(*ch>='A' && *ch<='Z')
{
		printf("uppercase");
	}
	else 
	{
		printf("lowercase");
	}
}