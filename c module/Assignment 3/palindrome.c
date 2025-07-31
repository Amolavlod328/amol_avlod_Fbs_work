//Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome
#include<stdio.h>
void main(){
	int no,i=1,rev=0;
	printf("Enter the Number:");
	scanf("%d",&no);
	int temp=no;
	while(temp>0){
		int rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		
	}
if(rev==no){
	printf("%d is palindrome number",no);
}else{
	printf("%d is not  palindrome number",no);
}
}