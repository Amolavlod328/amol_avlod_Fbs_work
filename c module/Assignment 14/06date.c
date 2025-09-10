//6. Date (date, month, year)
#include<stdio.h>
#include<string.h>
struct datefor
{
	int date;
	char month[10];
	int year;
};
void main()
{
	struct datefor d1,d2;
	
	d1.date=10;
	strcpy(d1.month,"december");
	d1.year=2005;
	
	printf("date is= %d\n month= %s\n year= %d",d1.date,d1.month,d1.year);
	
	printf("\n enter the date");
	scanf("%d",&d2.date);
	printf(" enter the month");
	scanf("%s",&d2.month);
	printf(" enter the year");
	scanf("%d",&d2.year);
	
		printf("date is= %d\n month= %s\n year= %d",d2.date,d2.month,d2.year);
	
	
}