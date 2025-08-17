#include<stdio.h>
void print1toN(int* );
void main(){
	int no;
	printf("Enter the number:");
	scanf("%d",&no);
	print1toN(&no);
	
}
void print1toN(int* n){
	int i=1;
	while(i<=*n){
		printf("%d ",i);
		i++;
	}
}