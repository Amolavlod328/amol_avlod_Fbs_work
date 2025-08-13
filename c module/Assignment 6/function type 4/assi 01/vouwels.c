#include<stdio.h>
char vouwels(char);
void main()
{
	char ch;
	char res= vouwels(ch);
	if(res==0)
	{
		printf("the char is vouwel");
	}
}
char vouwels(char ch)
{

	
	printf("enter the char:");
	scanf("%c",&ch);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		return 0;
	}
	else{
		printf("the char is not vouwel");
	}
}