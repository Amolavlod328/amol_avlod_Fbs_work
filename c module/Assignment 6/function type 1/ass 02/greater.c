#include<stdio.h>
void greater();
void main() 
{
	greater();
}
void greater()
{
	int a,b,c;
	printf("enter  three numbers:\n");
	scanf("%d%d%d",&a,&b,&c);
	if(a>b) {
		if(a>c) {
			printf("%d a greatest number:\n",a);
		}
	} else {
		if(b>c) {
			printf(" %d b  greatest number:\n",b);
		} else {
			printf("%d c greatest number:\n",c);
		}
	}
}