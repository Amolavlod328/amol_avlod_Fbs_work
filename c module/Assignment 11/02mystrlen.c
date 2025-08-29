//b. mystrlen
#include<stdio.h>
int mystrlen(char*);
void main()
{
	char str[10]="amol";
	printf(" the char is: %s\n ",str);
 int  cou=mystrlen(str);
   printf("the length is: %d ",cou);
}
int mystrlen(char* str )
{
		int i=0,count=0;

	while(str[i]!=0)
	{
		 count++;
		i++;
	}
return count;
}