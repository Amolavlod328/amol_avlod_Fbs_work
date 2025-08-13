#include<stdio.h>
int add();
int sub();
int mul();
double mod();
double div();

void main()
{
	
    int	result=add();
	printf("%d result of add\n",result);
	
	int	min=sub();
	printf("%d result of sub\n",min);
	
	int res=mul();
	printf("%d result of mul\n",res);
	
	double fin=mod();
	printf("%d result of mod\n",fin);
	
	double di=div();
	printf("%d result of div\n",di);
	

   
   
	

}

int add()
{
    int a,b;
	printf("enter the number a,b :");
	scanf("%d %d",&a,&b);
	int result=a+b;
    return result;
}
int sub()
 {
 	int a,b,min;
	printf("enter the number a,b :");
	scanf("%d %d",&a,&b);
	 min=a-b;
    return min;
 	
 }

 int mul()
 {
 	 int a,b,res;
	printf("enter the number a,b :");
	scanf("%d %d",&a,&b);
	 res=a*b;
    return res;
 }
 double mod()
 {
 	int a,b,fin;
	printf("enter the number a,b :");
	scanf("%d %d",&a,&b);
	 fin=a%b;
    return fin;
 	
 }
 double div()
 {
 	int a,b,di;
	printf("enter the number a,b :");
	scanf("%d %d",&a,&b);
	 di=a%b;
    return di;
}
