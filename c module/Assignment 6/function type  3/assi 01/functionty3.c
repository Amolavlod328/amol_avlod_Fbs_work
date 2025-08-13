#include<stdio.h>
void evenodd(int );
void age(int );
void upper(char);
void vouwel(char );
void leapyr(int);
void salary(double);
void rev(int );

	
void main()
{
	
	
	int a;
	printf("enter the number a:");
	scanf("%d",&a);
	evenodd(a);
	
		int ag;
	printf("enter the age:");
	scanf("%d",&ag );
	age(ag);
	
	char ch;
	printf("enter the character:");
	scanf(" %c",&ch);
	upper(ch);
	
	char c;
	printf("enter the char:");
	scanf(" %c",&c);
	 vouwel( c);
	 
	int yr;
	printf("enter the year:");
	scanf("%d",&yr );
    leapyr(yr);
	
	double bs;
	printf("enter the salary:");
	scanf("%d",&bs );
    salary( bs);
    
    int no;
    printf("enter the no:");
	scanf("%d",&no );
	rev(no);	
}
//evenodd starts
void evenodd(int a)
{

	
	if(a%2==0){
		printf("numer is even\n");
	}
	else{
		printf("number is odd\n");
	}
}
//evenodd ends
//age starts
void age(int ag)
{


	if(age>18){
		printf("you are eligible to vote\n");
	}
	else{
		printf("you are not eligible to vote\n");
	}
}
//age ends
//upper starts
void upper(char ch)
{



	if(ch>= 'A' && ch<='Z'){
	printf("this is a uppercase\n");
}
else if(ch>='a' && ch<='z'){
	printf("this is lowercase\n");
}
else{
	printf("the alpha you enter is not a alpha\n");
}
}
//upper ends
//vouwels starts
void vouwel(char c)
{


	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
		printf("the char is vouwel\n");
	}
	else{
		printf("the char is not vouwel\n");
	}
}
	//vouwel ends
    //leapyr starts
	void leapyr(int yr)
	{
	
	if((yr%4==0 && yr%100!=0)||(yr%400==0)){
		printf("year is leap\n");
	}
	else{
		printf("year is not leap\n");
	}
}
	//leapyr ends
	//bs salary starts
void salary(double bs)
{


	double da,ta,hra,ts;
	if(bs<=5000)
	{
		da=bs*0.10;
		ta=bs*0.20;
		hra=bs*0.25;
	}
	else
	{
		da=bs*0.15;
		ta=bs*0.25;
		hra=bs*0.30;
	}
	ts=bs+da+ta+hra;
	printf("bs=%lf\n",bs);
	printf("da=%lf\n",da);
	printf("ta=%lf\n",ta);
	printf("hra=%lf\n",hra);
		printf("Total=%lf\n",ts);
	}

//bs szlary ends
//rev starts
void rev(int no)
{
	
	int r1,r2,r3,q1,rev;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	printf("rev=%d",rev);
	
	
}

