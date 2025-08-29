//a. mystrcpy
#include<stdio.h>
char* mystrcpy(char*,char*);
void main()
{
	char arr[]="amolavlod";
	char temp[10];
	printf("arr is : %s",arr);
     mystrcpy(temp,arr);
		printf(" cpy is : %s",temp);
}
char* 	mystrcpy(char* temp,char* arr)
	{
	 int i;
	for( i=0;arr[i]!='\0';i++)
	{
	 temp[i]=arr[i];
	}
	temp[i]=='\0';
    return temp;

}
	

