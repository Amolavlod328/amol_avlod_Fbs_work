#include<stdio.h>
void getarmstrong(int*);
void main(){
	 int no;
printf("Enter the number:");
scanf("%d",&no);
	
     getarmstrong(&no);
}//main ends here

void getarmstrong(int* no){
   
int temp=*no,digits=0;
while(*no>0){
	
    *no=*no/10;
    digits++;
}

*no=temp;
	int sum=0;
	while(*no>0){
	int power=1;
	int digit=*no%10;
	for(int i=1;i<=digits;i++)
	{
		power=power*digit;
		}
	
	sum=sum+power;
	*no=*no/10;	
}if(temp==sum)
     printf("%d is Armstrong ",temp);
     else
   printf("%d is Not Armstrong ",temp);

}//getarmstrong ends here
