//Find factorial of given number.
//Input: n = 5
//Output: 120
#include<stdio.h>
void main() {
	int i=1,num,fact=1;
	printf("Enter the number:");
	scanf("%d",&num);

	while(i<=num) {
		fact=fact*i;
		i++;

	}
	printf("The factorial of %d is =%d",num,fact);
}