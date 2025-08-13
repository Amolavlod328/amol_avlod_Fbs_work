#include<stdio.h>
double getdiss(double ,double ,double ,char );
void main()
{
	double price,fp,disscount;
	char ch;
	getdiss( price, fp,disscount, ch);
	
}
 double getdiss(double price,double fp,double disscount,char ch)
 {
 
	
	printf("enter the price: ");
	scanf("%lf",&price);
	printf("are you a student (y/n): ");
	scanf(" %c",&ch);
	if(ch=='y'){
		if(price>500){
			disscount=price*0.20;
		}else{
			disscount=price*0.10;
		}
	}else{
		if(price>600){
			disscount=price*0.15;
		}else{
			printf("no disscount");
		}
	}
	printf("final price is: %lf",price-disscount);
}