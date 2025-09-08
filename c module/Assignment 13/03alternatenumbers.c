//5. Print alternate elements in array.
#include<stdio.h>
void main(){
	int* ptr=(int*) malloc(5*sizeof(int));
	ptr[0]=1;
	ptr[1]=2;
	ptr[2]=3;
	ptr[3]=4;
	ptr[4]=5;
	for(int i=0;i<5;i=i+2){
		
			printf("alternate numbers :%d\n",ptr[i]);
		}
}
