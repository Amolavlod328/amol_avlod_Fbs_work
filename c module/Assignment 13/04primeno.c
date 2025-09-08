#include<stdio.h>
#include<stdlib.h>
void main() {
	int* ptr=(int*) malloc(5*sizeof(int));
	ptr[0]=1;
	ptr[1]=27;
	ptr[2]=3;
	ptr[3]=41;
	ptr[4]=7;
	int status,num;
	for(int i=0; i<5; i++) {
		num=ptr[i];
		status=0;
		if(num<2) {
			status=1;
		}


		for (int j=2; j<num-1; j++) {
			if(num%j==0) {
				status=1;
			}
		}
        if(status==0) {
		printf("%d ",num);
	}
	}
	


}