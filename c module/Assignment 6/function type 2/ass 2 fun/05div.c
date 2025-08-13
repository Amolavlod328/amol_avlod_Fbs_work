#include<stdio.h>
int getdiv();
void main()
{
	int res=getdiv();
	if(res==0)
	{
		printf("divisible by both");
	}
	else if(res==1)
	{
		printf("divisible by 3 but not with 5");
	}
	else if(res==2)
	{
			printf("divisible by 5 but not with 3");
	}
}


int getdiv()
{

  int no=20;
  printf("%d\n",no);
  
  if(no%3==0 && no%5==0)
  {
  	return 0;
	  }	
	  else
	  	if(no%3==0 && no%5!=0)
		  {
	  		return 1;
		  }
		 else 
		    if(no%3!=0 && no%5==0)	
		    {
		    	return 2;
			}
		  
		  else
		  {
		  	printf("divisible by none");
		  }
		  }
	  


