//5. WAP to Count the Number of Vowels in a String
#include<stdio.h>
void main()
{
	char str[]="firatbio";
	printf("%s\n",str);
	
	int i=0;
	printf("the vowels from string element is :");
	while(str[i]!='\0')
	{
		char ch=str[i];
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			printf("%c ",ch);
		}
		i++;
		
	
	
	
	}
	}
	
	