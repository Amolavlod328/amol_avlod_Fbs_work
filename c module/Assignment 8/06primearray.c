//6. Accept array and print only prime numbers of array.
#include<stdio.h>
void main() {
	int arr[5]= {1,3,5,10,12};

	for( int i=0; i<5; i++) {
		printf("%d ",arr[i]);
	}
	printf("\n ");

	for(int i=0; i<5; i++) {
		int isprime=0;
		if (arr[i]<2) {
			isprime=1;
		}

		for(int j=2; j<arr[i]; j++) {
			if(arr[i]%j==0)
				isprime=1;

		}

		if(isprime==0) {
			//	for(i=0;i<5;i++)
			printf("prime is:%d\n",arr[i]);
		}
	}

}