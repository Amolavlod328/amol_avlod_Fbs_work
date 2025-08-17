#include<stdio.h>
int typeofage(int*);
void main(){
	int age=18;
	typeofage(&age);	
}
		
int typeofage(int* age){
	if(*age<12)
	{
			printf("child");
	}
	else
	{
		if(*age>=12 && *age<19)
			printf("teenager");
	}
	    if(*age>=20 && *age<59)
	    {
	    	printf("adult");
		}
		if(*age>60)
		{
		printf("please enter correct age");
		}
		
}
		