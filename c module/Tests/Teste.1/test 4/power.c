#include <stdio.h>

int main() {
    int base, exp;
    int result = 1;

  
    printf("Enter base: ");
    scanf("%d", &base);
    
    printf("Enter exponent: ");
    scanf("%d", &exp);

    
    for (int i = 1; i <= exp; i++) {
        result *= base;
    }

    printf("%d^%d = %d\n", base, exp, result);

    
}
