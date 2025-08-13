#include<stdio.h>
void FDLDsum(int);
void main(){
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
    FDLDsum(no);

}//main ends here

void FDLDsum(int no){
	int fd,ld;
	ld=no%10;
	fd=no;
	while(fd>10){
		fd=fd/10;
		
	}
	int sum=fd+ld;
printf("Sum of FD and LD = %d",sum);
}