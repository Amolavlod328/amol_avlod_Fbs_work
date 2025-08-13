#include<stdio.h>
void getpallindrome(int);
void main(){
  int no;
  printf("Enter the number:");
  scanf("%d",&no);
 getpallindrome(no);
  


}//main end here

void getpallindrome(int temp){
	int no=temp;
	int rev;
		while(temp>0){
		int rem=temp%10;
		 rev=rev*10+rem;
		temp=temp/10;
		
	}
	if(rev==no)
	printf("No is pallindrome");
	else
	printf("No not pallindrome");
}