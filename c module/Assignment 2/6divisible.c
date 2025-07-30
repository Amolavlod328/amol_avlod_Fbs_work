//Accept a number and check if it is divisible by 3, 5, or both.
//(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//both" or” Divisible by None”)
#include<stdio.h>
void main()
{
  int no=20;
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
	  


