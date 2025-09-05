// 2.WAP Replace all Occurrences of ‘a’ with $ in a String
#include<stdio.h>
void main()
{
	char str[]="shir ya";
	char ch;
	printf("enter the char want to change:");
	scanf("%c",&ch);
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]==ch)
		{
			str[i]='k';
		}
		printf("%c ",str[i]);
		i++;
	
	}
}