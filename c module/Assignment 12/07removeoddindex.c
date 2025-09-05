//7. WAP to Remove the Characters of Odd Index Values in a String
#include<stdio.h>
void main ()
{
      char str[20]="amola";
      int i=0,j=0;
      for(i=0;str[i]!='\0';i++){
      	 	if(i%2==0){
      	 		str[j]=str[i];
      	 		j++;
			   }
		   
	  }
	  str[j]='\0';
	  puts(str);
}