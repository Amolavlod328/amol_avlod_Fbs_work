//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
void main(){
	char ch;
	printf("enter the character:");
	scanf("%c",&ch);
	if(ch>= 'A' && ch<='Z'){
	printf("this is a uppercase");
}
else if(ch>='a' && ch<='z'){
	printf("this is lowercase");
}
else{
	printf("the alpha you enter is not a alpha");
}
	
}