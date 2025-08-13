#include<stdio.h>
int getpallindrome(int);
void main(){
  int no;
  printf("Enter the number:");
  scanf("%d",&no);
  int rev =getpallindrome(no);
  if(rev==no){
  	printf("Number is pallindrome");
  }else{
  	printf("Number is Not pallindrome");
  }


}//main end here

int getpallindrome(int temp){
	int rev;
		while(temp>0){
		int rem=temp%10;
		 rev=rev*10+rem;
		temp=temp/10;
		
	}
	return rev;
}