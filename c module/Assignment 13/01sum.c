//Find sum of all numbers.

#include<stdio.h>
#include <stdlib.h>
void main(){
	int* ptr=(int*) malloc(5*sizeof(int));
	ptr[0]=10;
	ptr[1]=10;
	ptr[2]=10;
	ptr[3]=10;
	ptr[4]=10;
	int sum=0;
	for(int i=0;i<5;i++){
		sum=sum+ptr[i];
	}
	printf("sum of array is %d",sum);
}