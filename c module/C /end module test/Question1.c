#include<stdio.h>
void main() {
    int n;
    printf("enter the range: ");
    scanf("%d",&n);

    int sum = 0;   

    for(int j=2; j<=n; j++)
	 {
        int flag = 1;
        for(int i=2; i<j; i++)
		 {
            if(j % i == 0) 
			{
                flag = 0;
                  
        }
        }
        if(flag == 1) {
            printf("%d is prime\n", j);
            sum += j;  
        }
    }

    printf("\nSum of prime numbers %d\n",  sum);
}
