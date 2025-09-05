//8. WAP to Calculate the Number of Words Present in a String
#include<stdio.h>
void main()
{
	char str[20];
	int i=0 ,count=0;
	printf("enter the string element: ");
	scanf("%s",&str[i]);
	while(str[i]!=0)
	{
		count++;
		i++;
	}
	
	printf("the lenth of: %s\n is: %d",str,count);
}