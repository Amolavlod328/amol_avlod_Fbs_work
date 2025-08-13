#include <stdio.h>

int main() {
    int start, end, sum = 0;
    printf("Enter start of range: ");
    scanf("%d", &start);

    printf("Enter end of range: ");
    scanf("%d", &end);

    for (int i = start; i <= end; i += 2) {
        sum += i;
    }

    printf("Sum of alternate numbers from %d to %d is: %d\n", start, end, sum);

   
}
