#include<stdio.h>
int markss(int*);
void main(){
	int marks=74;
    markss(&marks);
	
}

int markss(int* marks){

	if(*marks>=75)
	{
	printf("Distinction");
	}
	else
	{
	     if(*marks>=65)
		{
				printf("First Class");
		}
		else
		{
			if(*marks>=55)
			{
				printf("Second Class");
			}
			else
			{
				if(*marks>=40)
				{
						printf("Pass Class");
				}
				else if(marks<35)
					printf("fail");
				
			}
		}
	}
}