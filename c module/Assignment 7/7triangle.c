#include<stdio.h>
int triangleeis(int*,int*,int*);
void main(){
	int a,b,c;
	printf("enter the first value: ");
	scanf("%d", &a);
	printf("enter the second value: ");
	scanf("%d", &b);
	printf("enter the third value: ");
	scanf("%d", &c);
	triangleeis(&a,&b,&c);
}

int triangleeis(int* a,int* b,int* c){

	if(*a==*b && *b==*c)
		{
		printf("equilateral");
	}
	else
	{
	     if(*a==*b || *b==*c ||*a==*c)
		{
		 printf("isosceles");	
		}
		else
		{
			printf("scalene");
		}	
	}
	
}