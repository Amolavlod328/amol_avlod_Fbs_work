//1. Student (rollNo, name, marks)
#include<stdio.h>
#include<string.h>
struct student
{
     int  id;
     char name[20];
     int marks;
};
void main()
{

 struct student s1,s2;
 
 	s1.id=205;
 	strcpy(s1.name,"andy");
 	s1.marks=70;
 	printf(" student id=[%d]\n student name=[%s]\n student marks=[%d]",s1.id,s1.name,s1.marks);
 	
 	printf("\n         \n     enter second student detail\n    ");
 	
 	printf("\nenter the student id: ");
 	scanf("%d",&s2.id);
 	printf("enter the student name: ");
 	scanf("%s",&s2.name);
 	printf("enter the student marks: ");
 	scanf("%d",&s2.marks);
 	
 	printf(" student id=[%d]\n student name=[%s]\n student marks=[%d]",s2.id,s2.name,s2.marks);
 }
