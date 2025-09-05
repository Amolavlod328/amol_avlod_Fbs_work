//1. Write a program to scan string from user then scan a single character and search it
//in a accepted string.
#include<stdio.h>
void main()
{
	char str[]="birstbit";
	char ch='z';
	int i=0,flag=0;
	while(str[i]!='\0') 
	{
		if(str[i]==ch)
		{
			printf("found at %d",i);
			flag=1;
      	}
          i++;
      }
      if(flag==0)
      printf("not found");
  }
         