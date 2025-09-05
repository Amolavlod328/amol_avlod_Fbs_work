//WAP to Take in a String and Replace Every Blank Space with special symbol.
#include<stdio.h>
void main()
{
	char str[]="amol avlod";
	
	printf("the string is: %s\n",str);
	char ch;
	printf("enter a char to replace: ");
	scanf("%c",&ch);
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]==ch)
		{
		str[i]='$';
	}
		
		i++;
	}
	printf("%s",str);
	
}