//Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong
#include<stdio.h>

void main(){
	int no,fact,digit=0,sum=0;
	printf("Enter the number:");
	scanf("%d",&no);
	
	int temp=no;
	while(temp>0){
		
		digit=temp%10;
		fact=1;
		
		for(int i=1;i<=digit;i++){
			
			fact = fact*i;
		}
		sum=sum+fact;
		temp=temp/10;
	}

	if(no == sum){
		printf("%d is an strong number",no);
		
	}else{
			printf("%d is not an strong number",no);
	}
	






}