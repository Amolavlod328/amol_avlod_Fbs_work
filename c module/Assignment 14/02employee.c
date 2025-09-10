//2. Employee (id, name, salary)
#include<stdio.h>
#include<string.h>
struct employe
{
	int id;
	char name[20];
	int salary;
};
void main()
{
	struct employe e1,e2;
	
	e1.id=200;
	strcpy(e1.name,"amol");
	e1.salary=50000;
	
	printf(" id=%d\n name =%s\n salary=%d",e1.id,e1.name,e1.salary);
	
	printf("\nenter the details of employe 2");
	
	printf("\nenter the employe id: ");
	scanf("%d",&e2.id);
	printf("\nenter the employe name: ");
	scanf("%s",&e2.name);
	printf("\nenter the employe salary: ");
	scanf("%d",&e2.salary);
	
		printf(" id=%d\n name =%s\n salary=%d",e2.id,e2.name,e2.salary);
	
}