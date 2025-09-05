//4. WAP to Form a New String where the First Character and the Last Character have
//been Exchanged
#include<stdio.h>
void main() {
	char str[]="firstbit";
	int i=0;
	int x=strlen(str);

	while(str[i]!=0) {
		if(i==0) {
			int temp=str[i];
			str[i]=str[x-1];
			str[x-1]=temp;
		}
		i++;
	}

	printf("%s",str);
}