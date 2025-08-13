#include<stdio.h>
int getpalli();
void main()
{
	 getpalli();
}
 int getpalli()
 {
 
	int no=121,i=1,rev=0;
	printf("%d:",no);
//	scanf("%d",&no);
	int temp=no;
	while(temp>0){
		int rem=temp%10;
		temp=temp/10;
		rev=rev*10+rem;
		
		
	}
if(rev==no){
	printf("%d is palindrome number",no);
}else{
	printf("%d is not  palindrome number",no);
}
}