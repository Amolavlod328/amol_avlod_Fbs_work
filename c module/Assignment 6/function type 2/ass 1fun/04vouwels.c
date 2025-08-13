#include<stdio.h>
int vouwels();
void main()
{
	int res= vouwels();
	if(res==0)
	{
		printf("the char is vouwel");
	}
}
int vouwels()
{

	char ch;
	printf("enter the char:");
	scanf("%c",&ch);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		return 0;
	}
	else{
		printf("the char is not vouwel");
	}
}