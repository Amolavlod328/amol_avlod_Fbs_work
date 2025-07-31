//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
void main() {
	int num,i=1,sum=0;
	
	printf("Enter the number:");
	scanf("%d",&num);
	
	while(i<=num/2){
		
		if(num%i==0){
			sum=sum+i;
		}i++;
		
	}printf("sum is=%d\n",sum);
	
	if(sum==num){
		printf("%d is perfect number",num);
	}else{
		printf("%d is not perfect number",num);
	}
}
