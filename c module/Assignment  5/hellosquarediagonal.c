
//10. Print a hollow square with diagonal pattern
//Input: n = 5
//Output:
//* * * * *
//* *     *
//*   *   *
//*     * *
//* * * * *
#include<stdio.h>
void main(){
	int n=17;

	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(j==1||j==n||i==1||i==n||i==j)
				printf("* ");
			else
			printf("  ");
		
		}
		printf("\n");
	}
}