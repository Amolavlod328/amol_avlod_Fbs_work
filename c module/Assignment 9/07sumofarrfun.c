#include<stdio.h>
	void sumofarr(int [],int [],int[]);
void main()
{
	int arr[5]={10,20,30,40,50};
	int brr[5]={20,30,40,50,50};
	int crr[5],i;
	printf("arr: ");
	for( int i=0;i<5;i++){
		printf("%d ",arr[i]);
	}
	printf("\n");
		printf("        +     \n");
	printf("brr: ");
	for( i=0;i<5;i++){
		printf("%d ",brr[i]);
	}
	printf("\n");
		printf("        =     \n");
	printf("crr: ");
	
	 sumofarr( arr, brr,crr);

}

	void sumofarr(int arr[],int brr[],int crr[])
	
	{
		
	for( int i=0;i<5;i++){
	crr[i]=arr[i]+brr[i];
}
    	for(int j=0;j<5;j++)
    	printf("%d ",crr[j]);
}