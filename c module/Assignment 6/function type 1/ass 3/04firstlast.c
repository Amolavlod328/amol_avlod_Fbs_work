#include<stdio.h>
int getfirstlast();
void main()
{
	getfirstlast();
}
   int getfirstlast()
   {
   
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