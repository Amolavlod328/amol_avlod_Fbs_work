#include<stdio.h>
#include<math.h>
int armstrong();
void main()
{
	int res=armstrong();
	if(res==1){
		printf("armstrong");
	}
	else{
			printf("not armstrong");
	}
}

int armstrong(){

	int no,digits=0,sum=0;
	printf("Enter the number:");
	scanf("%d",&no);
	int temp=no;
	while(temp>0){
	  temp=temp/10;
		digits++;
	}
	temp=no;
while(temp>0){
	int digit=temp%10;
	sum=sum+pow(digit,digits);
	temp=temp/10;
}
if(sum==no){
return 1;
}else{
return 2;
}

}