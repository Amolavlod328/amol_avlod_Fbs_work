//Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)
#include<stdio.h>
void main(){
	int no,fd,ld;
	printf("Enter the Number:");
	scanf("%d",&no);
	ld=no%10;
	fd=no;
	while(fd>10){
		fd=fd/10;
		
	}
	int sum=fd+ld;
	printf("Sum of first and last digit of %d number is:%d",no,sum);
	
	
	
}