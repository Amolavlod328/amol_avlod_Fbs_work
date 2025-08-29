//mystrcasecmp user define function.
#include<stdio.h>
#include<string.h>
int mystrcasecmp(char*,char*);
void main()
{
	char str[]="AMOL";
	char brr[]="avlod";
	

int res=mystrcasecmp(str,brr);
	if(res==0){
		printf("both are equal");
	}
	else if(res>0){
		printf("str is greater");
	}
	else
	printf("brr is greater");
	
	
}
int mystrcasecmp(char*  str,char* brr)
{
	int i=0;
	while(str[i]!='\0'&&brr[i]!='\0'){
		char s1=str[i];
		char s2=brr[i];
		
		if(s1>='A'&&s1<='Z'){
			s1=s1+32;
		}
		if(s2>='A'&&s2<='Z'){
			s2=s2+32;
		}
		if(s1!=s2){
			return (s1-s2);
		}
	i++;	
	}
	
		return (str[i]-brr[i]);
	
	
}