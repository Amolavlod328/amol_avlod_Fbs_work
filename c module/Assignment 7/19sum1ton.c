#include<stdio.h>

void getSum(int*);
void main(){
	int no;
	printf("Enter the number:");
	scanf("%d",&no);

   
   getSum(&no);
	
}//main ends here

void getSum(int* no){
	int sum=0;
	int i=1;
	while(i<=*no){
	sum=sum+i;
		i++;
	}
printf("sum of 1 to %d is = %d",*no,sum);
}