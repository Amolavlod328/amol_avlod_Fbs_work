#include<stdio.h>
void getPerfect(int* );
void main() {
	int num;
	
	printf("Enter the number:");
	scanf("%d",&num);
	
	getPerfect(&num);
}//main end
void getPerfect(int* num){
	int i=1,sum=0;
	while(i<=*num/2){
		
		if(*num%i==0){
			sum=sum+i;
		}i++;
		
	}printf("sum is=%d\n",sum);
	
	if(sum==*num){
		printf("%d is perfect number",*num);
	}else{
		printf("%d is not perfect number",*num);
	}
}