#include<stdio.h>
int getfact();
void main()
 {
 	int fact= getfact();
 	printf("The factorial of no is =%d", fact);
 }
 int getfact()
 {
 
	int i=1,num,fact=1;
	printf("Enter the number:");
	scanf("%d",&num);

	while(i<=num) {
		fact=fact*i;
		i++;

	}
	return fact;
}