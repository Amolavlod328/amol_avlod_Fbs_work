#include<stdio.h>
void marks();
void main()
{
	marks();
}
void marks()
{
	int marks;
	printf("Enter Marks:");
	scanf("%d",&marks);
	if(marks>=65) {
		printf("First Class");
	} else {
		if(marks>=55) {
			printf("Second class");
		} else {
			if(marks>=40) {
				printf("Pass");

			} else {
				printf("Fail");
			}
		}
	}
}