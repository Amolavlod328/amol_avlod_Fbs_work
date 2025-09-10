//8. Distance ( feet, inch)
#include<stdio.h>
struct distance
{
	int feet;
	int inch;
	
};
void main()
{
	struct distance d1,d2;
	
	d1.feet=20;
	d1.inch=5;
	
	printf("feet= %d\ninch=%d\n",d1.feet,d1.inch);
	
	printf("enter the second distance");
	
	printf("\nenter the feet: ");
	scanf("%d",&d2.feet);
	
		printf("enter the inch: ");
	scanf("%d",&d2.inch);
	
		printf("feet= %d\ninch=%d\n",d2.feet,d2.inch);
	
	
}