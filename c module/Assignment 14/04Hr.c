//4. HR (id, name, salary, commission)
#include<stdio.h>
#include<string.h>
struct Hr
{
	int id;
	char name[10];
	int salary;
	int comm;
};
void main()
{
	struct Hr h1,h2;
	
	h1.id=500;
	strcpy(h1.name,"andy");
	h1.salary=50000;
	h1.comm=4000;
	
	printf(" hr id=%d\n hr name=%s\n hr salary=%d\n hr comm=%d\n",h1.id,h1.name,h1.salary,h1.comm);
	
	printf(" enter the second Hr details ");
	
	printf("\nenter the Hr id: ");
	scanf("%d",&h2.id);
	printf("enter the Hr name: ");
	scanf("%s",&h2.name);
	printf("enter the Hr salary: ");
	scanf("%d",&h2.salary);
	printf("enter the Hr comm: ");
	scanf("%d",&h2.comm);
	
		printf(" hr id=%d\n hr name=%s\n hr salary=%d\n hr comm=%d\n",h2.id,h2.name,h2.salary,h2.comm);
	
	
}