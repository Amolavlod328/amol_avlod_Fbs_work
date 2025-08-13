#include <stdio.h>

double student(double ,double,double,char); 

int main() {
	double price, discount = 0.0, final_price;
    char ch;
    final_price = student( price, discount , final_price, ch);
    printf("Final price is: %.2lf\n", final_price);
    return 0;
}

double student(double price, double discount ,double final_price,char ch)
 {
    

    printf("Enter the price: ");
    scanf("%lf", &price);

    printf("Are you a student (y/n): ");
    scanf(" %c", &ch);

    if (ch == 'y' || ch == 'Y') {
        if (price > 500) {
            discount = price * 0.20;
        } else {
            discount = price * 0.10;
        }
    } else {
        if (price > 600) {
            discount = price * 0.15;
        } else {
            printf("No discount applied.\n");
        }
    }

    final_price = price - discount;
    return final_price;
}
