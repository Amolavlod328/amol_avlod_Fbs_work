//10. Write a program to check the string is palindrome or not.
#include<stdio.h>
#include<string.h>
void main()
{
	char arr[]="hannaH";
	
	int i;
int	len=strlen(arr);
	

   for(i=len-1;i>=0;i--)
   {
      printf("%c",arr[i]);
   }
  
}