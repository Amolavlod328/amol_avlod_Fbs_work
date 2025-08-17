#include <stdio.h>
void as41tonarmstrong(int*);
void main(){
	int no;
	printf("enter a range :");
	scanf("%d",&no);
	as41tonarmstrong(&no);
	
	
}

void as41tonarmstrong(int* no) {
	
	for(int k=1;k<=*no;k++){
	 int no=k;
	int temp=no;
	int count=0;
	while(no>0) {
		no=no/10;
		count++;
	}
	int sum = 0;
	no=temp;
	while (no > 0) {
		int rem =no%10;
		int res=1;

		for (int i =1; i<=count; i++) {
			res = res*rem;
		
		}

		sum =sum+ res;
		no = no / 10;
		
	}
		if(sum==temp)
		{
			printf("number is armstrong: %d\n",sum);
		}
}
}
