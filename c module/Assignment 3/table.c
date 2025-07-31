//Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50
#include<stdio.h>
void main(){
	int a,i=0;
	printf("enter the table number: ");
	scanf("%d",&a);
	printf("The Table of %d\n",a);
	

	{
		while(i<10){
		
		i++;
		printf("%d * %d = %d\n",a,i,a*i);
	}
	}
}
