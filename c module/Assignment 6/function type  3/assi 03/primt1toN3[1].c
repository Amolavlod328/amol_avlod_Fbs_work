//Print numbers from 1 to 10
//Output: 1 2 3 4 5 6 7 8 9 10
#include<stdio.h>
void print1toN(int );
void main(){
	int no;
	printf("Enter the number:");
	scanf("%d",&no);
	print1toN(no);
	
}
void print1toN(int n){
	int i=1;
	while(i<=n){
		printf("%d ",i);
		i++;
	}
}