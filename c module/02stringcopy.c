#include<stdio.h>
#include<string.h>
void main()
{
char str[20];
char temp[20];
printf("enter a string:");
scanf("%s",&str);
printf("before cpy  %s\n",str);
 strcpy(temp,str);
 
 printf("after cpy %s",temp);
}
