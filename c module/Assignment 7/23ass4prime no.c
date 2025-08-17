#include<stdio.h>
void as4primenumbers(int*);
void main(){
	int num;
	scanf("%d",&num);
	as4primenumbers(&num);
	
}
void as4primenumbers(int* num) {
	
	for(int k=2;k<=*num;k++) {
		int num=k,status=1;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				status=0;
		}
		if(status==1)
			printf("%d\n",k);

	}
}