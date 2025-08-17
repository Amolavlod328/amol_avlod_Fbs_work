#include<stdio.h>
int divbythreeandfive(int*,int*,int*);
void main(){
	int a=3,b=5,num;
	printf("enter the number");
	scanf("%d",&num);
	divbythreeandfive(&a,&b,&num);
}




int divbythreeandfive(int* a,int* b,int* num){

	if(*num%3==0 && *num%5==0) 
	{
	printf("divide by 3 and 5");
	}
	else
	{
		if(*num%3==0 && *num%5!=0)
		{
				printf("divided by 3");
		}
		else
		{
			if(*num%3!=0 && *num%5==0)
		{
	      printf("divided by 5");
		}
		else{
		printf("divided by none");
		}
		
	}
}
}