#include<stdio.h>
int getfirstlast(int,int,int);
void main()
{
	int no,fd,ld;
	int sum= getfirstlast(no,fd,ld);
	printf("Sum of first and last digit of  number is:%d",sum);
	  
}
int getfirstlast(int no,int fd,int ld)
{


	printf("Enter the Number:");
	scanf("%d",&no);
	ld=no%10;
	fd=no;
	while(fd>10){
		fd=fd/10;
		
	}
	int sum=fd+ld;
	return sum;
	
	
	
}