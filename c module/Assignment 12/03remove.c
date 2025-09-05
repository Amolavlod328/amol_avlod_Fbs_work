//3. WAP to Remove the nth Index Character from a Non-Empty String
#include<stdio.h>
void main()
{
	char str[]="firstbit";
	int ind;
	printf("enter a index you wnt to remove:");
	scanf("%d",&ind);
	int i=ind;
	while(str[i]!='\0')
	{
		str[i]=str[i+1];
		i++;
	}
	printf("%s",str);
	
}