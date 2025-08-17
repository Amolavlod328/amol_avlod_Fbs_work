#include<stdio.h>
double  salarys(double*,double*,double*,double*,double*);
void main(){
	double salary=5000,da,ta,hra,totalsalary;
	salarys(&salary,&da,&ta,&hra,&totalsalary);
}

double salarys(double* salary,double* da,double* ta,double* hra,double* totalsalary){

	if(*salary<=5000) {
		*da=*salary*0.10;
		*ta=*salary*0.20;
		*hra=*salary*0.25;
	} 
	else {
		*da=*salary*0.15;
		*ta=*salary*0.25;
		*hra=*salary*0.30;
	}
	*totalsalary=*salary+*da+*ta+*hra;
      printf("total salary is:%lf",*totalsalary);
	
}