#include<stdio.h>
int getage(int);
void main()
{
	int age;
	 int res=getage(age);
	 if(res==0)
	 {
	 	printf("you are eligible to vote");
	 }
}
int getage(int age)
{

	
	printf("enter the age:");
	scanf("%d",&age );
	if(age>18){
		return 0;
	}
	else{
		printf("you are not eligible to vote");
	}
}