#include<stdio.h>
int oddeven(int*);
void main(){
	int a= 3;
	oddeven(&a);
	
}

int oddeven(int* a){
	if(*a%2==0){
	
			printf("number is even");
	}
	else{
		printf("number is odd");
	}
}