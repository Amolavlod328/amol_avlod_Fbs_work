#include<stdio.h>
int getfact(int,int,int);
void main()
 {
 	int i=1,num,fact;
    fact=getfact(i,num,fact);
 	printf("The factorial of no is =%d", fact);
 }
 
 
 int getfact(int i,int num,int fact)
 {
 
	fact=1,i=1;
	printf("Enter the number:");
	scanf("%d",&num);

	while(i<=num) {
		 fact=fact*i;
		i++;

	}
	return fact;
}