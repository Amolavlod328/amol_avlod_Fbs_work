#include<stdio.h>
double studentornot(double*,double*,double*,char*);
void main(){
	double price,discount,final_price;
	char ch;
	printf("enter the price : ");
	scanf("%lf",&price);
	printf("are you student or not (y/n) : ");
	scanf(" %c", &ch);
	
	studentornot(&price,&discount,&final_price,&ch);
	
	
	
}

double studentornot(double* price,double* discount,double* final_price,char* ch){

	if(*ch=='y'){
		if(*price>=500){
			*discount=(20.0/100)*(*price);
		}
		else
		{
			*discount=(10.0/100)**price;
		}
	}
	else
	{
		if(*price>=600)
		{
		  *discount=(15.0/100)**price;	
		}
		else
		{
			discount=0;
		}
	
	}
	*final_price=*price-*discount;
	printf("final price is :%lf",*final_price);
}