#include<stdio.h>
void main()
{
	char str[]="amol";

	char ch;
	printf("enter a char want to change: ");
	scanf("%c",&ch);

//	char sp;
//     scanf("%c",&sp);
     	int i=0;
	
	while(str[i]!='\0')
	{
		if(str[i]==ch)
		{
			
			str[i]='$';
		}
			printf("%c",str[i]);
			i++;
	}


	
}