//9. Complex (real, imaginary)
#include<stdio.h>
struct complex
{
	int real;
	int imagin;
};
void main()
{
	struct complex r1,r2;
	
	r1.real=25;
	r1.imagin=5;
	
	printf("real is =%d imagin=%d\n",r1.real,r1.imagin);
	
	printf("enter second no\n");
	
	printf("enter the real no: ");
	scanf("%d",&r2.real);
	
		printf("enter the imagin no: ");
	scanf("%d",&r2.imagin);
	
		printf("real is =%d imagin=%d\n",r2.real,r2.imagin);
}