#include<stdio.h>
void getStrong(int* );
void main(){
	int no;
	printf("Enter the number:");
	scanf("%d",&no);
	getStrong(&no);
	
	
}//main ends here

void getStrong(int* no){
		int sum=0;
		int temp=*no;
		while(*no>0){
			int rem=*no%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
				}
				sum=sum+fact;
				*no=*no/10;
			
		}if(temp==sum)
		printf("No is Strong");
		else{
			printf("No is NOT Strong");
		}
	
}