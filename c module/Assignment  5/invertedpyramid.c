//Print an inverted pyramid pattern
//Input: n = 5
//Output:
//*****
//****
//***
//**
//*
#include<stdio.h>
void main(){
	int n=7;
	for(int i=7;i>=1;i--){
		for(int j=0;j<=n-i;j++){
			printf(" ");
		}
		for(int k=1;k<=i;k++){
			printf("# ");
		}
		printf("\n");
	}
}