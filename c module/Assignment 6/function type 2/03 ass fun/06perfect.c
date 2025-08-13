#include<stdio.h>
int getperfect();
void main()
 {
 	int res= getperfect();
 	if(res==0)
 	{
 		printf("no is perfect number");
	 }
 }
   int getperfect()
   {
   
	int num,i=1,sum=0;
	
	printf("Enter the number:");
	scanf("%d",&num);
	
	while(i<=num/2){
		
		if(num%i==0){
			sum=sum+i;
		}i++;
		
	}printf("sum is=%d\n",sum);
	
	if(sum==num){
		return 0;
	}else{
		printf("%d is not perfect number",num);
	}
}
