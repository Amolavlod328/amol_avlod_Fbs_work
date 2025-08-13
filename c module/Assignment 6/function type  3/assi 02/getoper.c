#include<stdio.h>
double getoper(double ,double ,char );
void main() 
{
  

	double a,b;
	char oper;
	printf("enter the number a :");
	scanf(" %lf",&a);
	printf("enter the operator:(+,-,/,*,%):");
	scanf(" %c",&oper);
	printf("enter the number b :");
	scanf(" %lf",&b);
	getoper( a, b, oper);
}
    double getoper(double a,double b,char oper)
{

	if(oper=='+') {
		printf("result of a+b is %lf\n ",a+b);
	} else if(oper=='-') {
		printf("result of a-b is %lf\n ",a-b);
	} else if(oper=='*') {
		printf("result of a*b is %lf\n ",a*b);
	} else if(oper=='/') {
		if(b!=0) {
			printf("result of a/b is %lf\n ",a/b);
		}
	} else if(oper=='%') {
		if(b!=0) {
			printf("result of a%%b is %d\n ",(int)a%(int)b);
		}
	}
	else {
		printf("Invalid operator");

	}
}

