#include<stdio.h>
char vowelandconso(char*);
void main() {
	char ch='y';
	vowelandconso(&ch);

}



char vowelandconso(char* ch) {

	if(*ch=='a'||*ch=='e'||*ch=='i'||*ch=='o'||*ch=='u'||*ch=='A'||*ch=='E'||*ch=='I'||*ch=='O'||*ch=='U') {
		printf("vowel");
	} else  {
		printf("consonant");
	}
}