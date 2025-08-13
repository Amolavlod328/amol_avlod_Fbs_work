#include<stdio.h>
int getpalli();
void main()
{
	int res= getpalli();
	if(res==0)
	{
		printf("no is palindrome number");
	}
	
	
}
int getpalli()
{

	int no=121,i=1,rev=0;
	printf("%d:",no);
	int temp=no;
	while(temp>0){
		int rem=temp%10;
		temp=temp/10;
		rev=rev*10+rem;
		
		
	}
if(rev==no){
	return 0;
}else{
	printf("%d is not  palindrome number",no);
}
}