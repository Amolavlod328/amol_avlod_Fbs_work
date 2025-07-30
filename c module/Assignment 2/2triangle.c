//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
#include<stdio.h>
void main()
{
	int a=4,b=5,c=6;
	if(a==b&&b==c){
		printf("triangle is equaletral");
	}
	else
	{
		if(a==b||b==c||c==a)
	{
		printf("triangle is isosceles ");
	}
	else
	{
	    printf("triangle is scalene ");	
	}
	}
	
}