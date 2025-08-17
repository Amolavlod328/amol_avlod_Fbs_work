#include<stdio.h>
int greateramongthree(int*,int*,int*);
void main(){
	int a=10,b=200,c=300;
	greateramongthree(&a,&b,&c);
	
    
}
int greateramongthree(int* a,int* b,int* c){

	if(*a>*b && *a>*c){
		printf("a is greater");
	}
	else{
		if(*b>*c){
			printf("b is greater");
		}
		else
		{
			printf("c is greater");
		}
		
	}
}