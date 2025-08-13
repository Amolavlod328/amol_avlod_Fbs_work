// Function type 1
//without parameter without return
// assignment 1


#include<stdio.h>
void  even();
void	age();
void upperlow();
void	vouwels();
void	leapyr();
void salary();
void	revers();
void main()
{
	even();
	age();
	upperlow();
	vouwels();
	leapyr();
	salary();
	revers();
	
}


// even odd starts
void even()
{
age();	
int a;
	printf("enter the number a\n:");
	scanf("%d",&a);
	if(a%2==0){
		printf("numer is even\n");
	}
	else{
		printf("number is odd\n");
	}
} //even ends here
    
    //age starts
void age(){
	int age;
	printf("enter the age:\n");
	scanf("%d",&age );
	if(age>18){
		printf("you are eligible to vote\n");
	}
	else{
		printf("you are not eligible to vote\n");
	}
} //age ends here

  //uperlow stars here
  void upperlow(){
	char ch;
	printf("enter the character:\n");
	scanf(" %c",&ch);
	if(ch>= 'A' && ch<='Z'){
	printf("this is a uppercase\n");
}
else if(ch>='a' && ch<='z'){
	printf("this is lowercase\n");
}
else{
	printf("the alpha you enter is not a alpha\n");
}
	
}//upperlow ends here

   //vouwels stars here

void vouwels(){
	char ch;
	printf("enter the char:\n");
	scanf(" %c",&ch);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
		printf("the char is vouwel\n");
	}
	else{
		printf("the char is not vouwel\n");
	}
}
//  vouwels ends here
//  leapyr stars here

void leapyr(){
	int yr;
	printf("enter the year:\n");
	scanf("%d",&yr);
	if((yr%4==0 && yr%100!=0)||(yr%400==0)){
		printf("year is leap\n");
	}
	else{
		printf("year is not leap\n");
	}
}
//  leapyr ends here

// salary stars here
void salary()
{
	double bs;
	printf("enter the salary");
	scanf("%lf",&bs);
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
		printf("Total=%lf",ts);
	
}
// salary ends here
 
 // revers starts here
   void revers()
{
	int no=258;
	int r1,r2,r3,q1,rev;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	printf("rev=%d\n",rev);
	
	
}
// revers ends here



