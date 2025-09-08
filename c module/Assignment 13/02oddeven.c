//Find odd and even among the numbers.
#include<stdio.h>
void main(){
	int* ptr=(int*) malloc(5*sizeof(int));
	ptr[0]=1;
	ptr[1]=2;
	ptr[2]=3;
	ptr[3]=4;
	ptr[4]=5;
	for(int i=0;i<5;i++){
		if(ptr[i]%2==0){
			printf("even numbers :%d\n",ptr[i]);
		}
		else{
			printf("odd numbers :%d\n",ptr[i]);
		}
	}
}