//5. SalesManager (id, name, salary, incentive, target)
#include<stdio.h>
#include<string.h>
struct salesmanager
{
	int id;
	char name[10];
	int salary;
	int incen;
	int tar;
};
void main()
{
	struct salesmanager s1,s2;
	s1.id=5;
	strcpy(s1.name,"amol");
	s1.salary=50000;
	s1.incen=4000;
	s1.tar=20000;
	
	printf("   salesmanager's\n    id=%d\n name=%s\n salary=%d\n incentive=%d\n terget=%d",s1.id,s1.name,s1.salary,s1.incen,s1.tar);
	
	printf("\n  enter the details of secomd salesmanager  \n");
	
	printf("enter the id: ");
	scanf("%d",&s2.id);
	printf("enter the name: ");
	scanf("%s",&s2.name);
	printf("enter the salary: ");
	scanf("%d",&s2.salary);
	printf("enter the incen: ");
	scanf("%d",&s2.incen);
	printf("enter the targer: ");
	scanf("%d",&s2.tar);
	
		printf("   salesmanager's\n    id=%d\n name=%s\n salary=%d\n incentive=%d\n terget=%d",s2.id,s2.name,s2.salary,s2.incen,s2.tar);

}