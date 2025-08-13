#include<stdio.h>
void age(); // decl
void main()
{
	 age();//call
} //main ends
void age()  // defe
{
	int age;
	printf("Enter the Age:");
	scanf("%d",&age);
	if(age<12){
		printf("Child");
	}else if (age>=12&&age<=19){
		printf("teenager");
	}else if(age>=20&&age<=59){
		printf("Adult");
		
	}else{
		printf("Senior");
	}
}