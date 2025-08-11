//Print an inverted right-angled triangle pattern
//Input: n = 5
//Output:
//*****
//****
//***
//**
//*
#include<stdio.h>
void main(){
	int n=5;
	for(int row=1;row<=n;row++){
		for(int col=5;col>=row;col--){
			printf("* ");
		}
		printf("\n");
	}
}