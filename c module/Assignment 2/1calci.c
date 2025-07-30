#include<stdio.h>
void main() {

	double a,b;
	char operator;
	printf("enter the number a :");
	scanf(" %lf",&a);
	printf("enter the operator:(+,-,/,*,%):");
	scanf(" %c",&operator);
	printf("enter the number b :");
	scanf(" %lf",&b);


	if(operator=='+') {
		printf("result of a+b is %lf\n ",a+b);
	} else if(operator=='-') {
		printf("result of a-b is %lf\n ",a-b);
	} else if(operator=='*') {
		printf("result of a*b is %lf\n ",a*b);
	} else if(operator=='/') {
		if(b!=0) {
			printf("result of a/b is %lf\n ",a/b);
		}
	} else if(operator=='%') {
		if(b!=0) {
			printf("result of a%%b is %d\n ",(int)a%(int)b);
		}
	}




	else {
		printf("Invalid operator");

	}
}

