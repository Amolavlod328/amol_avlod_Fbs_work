//9. WAP to Take in Two Strings and Display the Larger String without Using Built-in
//Functions
#include<stdio.h>
void main() {
	char str[]="amol";
	char str2[]="avlod";
	int i=0,j;
	
	
    while(str[i]!='\0'&&str2[i]!='\0')
    {
    	if(str[i]!=str2[i])
    	{
    	break;
    }
    i++;
	}
	    if(str[i]>str2[i])
	    {
	    	printf("str is greater");
		}
		else
		{
			printf("str2 is greater");
		}
}