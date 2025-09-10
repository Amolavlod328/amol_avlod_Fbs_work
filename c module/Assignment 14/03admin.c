//3. Admin (id, name, salary, allowance)
#include<stdio.h>
#include<string.h>
struct admin
{
	int id;
	char name[10];
	int salary;
	int allow;
};
void main()
{
	struct admin a1,a2;
	
     a1.id=807;
     strcpy(a1.name,"amol");
     a1.salary=50000;
     a1.allow=10000;
     
     printf(" admin id= %d\n admin name=%s\n admin sallary:%d\n admin allow=%d\n",a1.id,a1.name,a1.salary,a1.allow);
     
     printf("enter the details of second admin\n");
     
     printf("enter the admin id: ");
     scanf("%d",&a2.id);
     printf("enter the admin name: ");
     scanf("%s",&a2.name);
     printf("enter the admin salary: ");
     scanf("%d",&a2.salary);
     printf("enter the admin allowence: ");
     scanf("%d",&a2.allow);
     
          printf(" admin id= %d\n admin name=%s\n admin sallary:%d\n admin allow=%d\n",a2.id,a2.name,a2.salary,a2.allow);
     
}