/*
 ============================================================================
 Name        : newf.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
void sum();
int main(void) {
	sum();
	return EXIT_SUCCESS;
}
	void sum()
	{
		int num1,num2,result;
		setbuf(stdout,NULL);
		printf("enter to numbers:");
		scanf("%d %d",&num1,&num2);
		result=num1+num2;
		printf("sum is =%d",result);
	}
