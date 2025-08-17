#include<stdio.h>
int age(int*);
void main(){
	int a=17;
	age(&a);
	
}

int age(int* a){

	if(*a>=18)
   {
		printf("youre eligile to vote");
	}
	else{
		printf("youre not eligile to vote");
	}
}