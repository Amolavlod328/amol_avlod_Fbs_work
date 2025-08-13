#include<stdio.h>
int divby(int no);
void main()
{
	int no=20;
    divby( no);
}
  int divby(int no)
  {
  
  printf("%d\n",no);
  
  if(no%3==0 && no%5==0)
  {
  	printf("divisible by both");
	  }	
	  else
	  	if(no%3==0 && no%5!=0)
		  {
	  		printf("divisible by 3 but not with 5");
		  }
		 else 
		    if(no%3!=0 && no%5==0)	
		    {
		    	printf("divisible by 5 but not with 3");
			}
		  
		  else
		  {
		  	printf("divisible by none");
		  }
		  }
	  