#include<stdio.h>
void discount();
void main()
{
	discount();
}
void discount()
{
	double price,discount,netprice;
	char ch;

	printf("Enter the Price:");
	scanf("%lf",&price);
	printf("are you student ? (y/n):");
	scanf(" %c",&ch);
	if(ch=='y') {
		printf("User is Student\n");
		if(price>500) {
			discount=price*0.20;
			netprice=price-discount;
			printf(" Total Discount: %lf\n",discount);
			printf("Net Price: %lf",netprice);
		} else {
			discount=price*0.10;
			netprice=price-discount;
			printf(" Total Discount: %lf\n",discount);
			printf("Net Price: %lf",netprice);

		}

	} else {
		printf("User not Student\n");
		if(price>600) {
			discount=price*0.15;
			netprice=price-discount;
			printf(" Total Discount: %lf\n",discount);
			printf("Net Price: %lf",netprice);
		} else {
			printf("Discount not awailable");
		}
	}
}