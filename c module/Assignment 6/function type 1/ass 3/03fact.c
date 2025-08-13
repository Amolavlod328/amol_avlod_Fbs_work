#include<stdio.h>
int getfact();
void main() 
{
 getfact();
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
	printf("The factorial of %d is =%d",num,fact);
}