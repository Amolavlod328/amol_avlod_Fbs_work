#include<stdio.h>
void main(){
	int* arr=(int*) malloc(5*sizeof(int));
	arr[0]=1;
	arr[1]=2;
    arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	
	
	int* brr=(int*) malloc(5*sizeof(int));
	brr[0]=10;
	brr[1]=20;
	brr[2]=30;
	brr[3]=40;
	brr[4]=50;
	
	
	int* crr=(int*) malloc(10*sizeof(int));
	
	
	
	int i;
	
	for(i=0;i<5;i++){
		crr[i]=arr[i];
		printf("%d ",crr[i]);
	}
	
	for(int j=0;j<5;j++){
		crr[i]=brr[j];
		printf("%d ",crr[i]);
		i++;
	}
}