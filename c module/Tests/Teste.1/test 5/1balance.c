#include<stdio.h>
void  bank(int ,int  );
void main()
{
		int bal=1000;
	    int dep;
	    bank( bal, dep);
}
void  bank(int bal ,int dep  )
{
	printf("your bal is :%d\n",bal);
	printf("enter the amount to diposit:");
	scanf("%d",&dep);
     bal=bal+dep;
     printf(" after deposit balance :%d\n",bal);
     
	 if(bal<3000)
	{
	
	
		printf(" sorry !cant withdraw the amount balance is not sufficient");
	}
}
