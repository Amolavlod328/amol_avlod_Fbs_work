#include<stdio.h>
void main() {
	int arr[5]= {1,2,3,4,5};
	int arr2[5]= {4,8,7,2,5};

	int i,j;
	for( i=0; i<5; i++) {
		for( int j=0; j<5; j++) {
			if(arr[i]==arr2[j]) {
				printf("%d",arr[i]);
			}
		}
	}
}