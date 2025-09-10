//10. Product (id, name, quantity, price)
#include<stdio.h>
#include<string.h>
struct product
{
	int id;
	char name[10];
	int qyantity;
	int price;
};
void main()
{
	struct product p1,p2;
	
	p1.id=20;
	strcpy(p1.name,"chips");
	p1.qyantity=20;
	p1.price=10;
	
	printf(" id= %d\nname =%s\nquantity= %d\nprice =%d\n",p1.id,p1.name,p1.qyantity,p1.price);
	
		printf("enter the id: ");
	scanf("%d",&p2.id);
	printf("enter the name: ");
	scanf("%s",&p2.name);
	printf("enter the quantity: ");
	scanf("%d",&p2.qyantity);
	printf("enter the price: ");
	scanf("%d",&p2.price);
	
		printf(" id= %d\nname =%s\nquantity= %d\nprice =%d\n",p2.id,p2.name,p2.qyantity,p2.price);
	
}