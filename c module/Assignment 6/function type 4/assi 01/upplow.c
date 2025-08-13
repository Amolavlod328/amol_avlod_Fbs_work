#include<stdio.h>
char upper(char);
void main()
{
	char ch;
	char res=upper(ch);
	if(res==0)
	{
	   printf("this is a uppercase");
    }
    if(res==1)
    {
    	printf("this is lowercase");
	}
	
}
char upper(char ch)
{

	
	printf("enter the character:");
	scanf("%c",&ch);
	if(ch>= 'A' && ch<='Z'){
	return 0;
}
else if(ch>='a' && ch<='z'){
	return 1;
}
else{
	printf("the alpha you enter is not a alpha");
}
	
}