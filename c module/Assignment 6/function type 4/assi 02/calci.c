#include<stdio.h>
int add(int,int,int);
int sub(int,int,int);
int mul(int,int,int);
int mod(int,int,int );
double div();

void main()
{
	int a,b;
    int	result=add(a,b,result);
	printf("%d result of add\n",result);
	
	
	int	min=sub( a, b, min);
	printf("%d result of sub\n",min);
	
	int res=mul( a, b,res);
	printf("%d result of mul\n",res);
	
	int fin=mod( a, b, fin);
	printf("%d result of mod\n",fin);
	
	double di=div();
	printf("%d result of div\n",di);
	

   
   
	

}

int add(int a,int b,int result)
{
    
	printf("enter the number a,b :");
	scanf("%d %d",&a,&b);
	result=a+b;
    return result;
}
int sub(int a,int b,int min)
 {
 	
	printf("enter the number a,b :");
	scanf("%d %d",&a,&b);
	 min=a-b;
    return min;
 	
 }

 int mul(int a,int b,int res)
 {
 	 
	printf("enter the number a,b :");
	scanf("%d %d",&a,&b);
	 res=a*b;
    return res;
 }
 int mod(int a,int b,int fin)
 {
 
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
