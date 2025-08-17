#include<stdio.h>
void as4perfect(int*,int*,int*,int*,int*);
void main(){
	int num=145,r,sum=0,i,fact=1;
	as4perfect(&num,&r,&sum,&i,&fact);
}
  void as4perfect(int* num,int* r,int* sum,int* i,int* fact)
 {
 	
 	int temp=*num;
 	while(temp!=0){
 		*fact=1;
 		*r=temp%10;
 		
 		
 		for(*i=1;*i<=r;*i++){
 			*fact=*fact**i;
		 }
		 *sum=*sum+*fact;
		 temp=temp/10;
	 }
	 if(*sum==*num)
	 printf("strong");
  } 