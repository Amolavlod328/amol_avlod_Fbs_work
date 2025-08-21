#include<stdio.h>
void pricesell(int ,int );
void main()
{
	
	int price=600;
	int discount;
	printf("the actual price is: %d\n",price);
	pricesell( price, discount);
}
//main ends
void pricesell(int price,int discount)
{
		
	if(price==600)
	{
	discount=price*0.20;
	}
	printf("you got discount is  %d\n",discount);
	printf("after discount selling price %d\n",price-discount);
	
	
}