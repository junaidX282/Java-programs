/*
 ============================================================================
 Name        : aa.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int number1;
	float number2,sum;
	setbuf(stdout,NULL);
	printf("enter two numbers");
	scanf("%d",&number1);
	scanf("%f",&number2);

	sum=number1+number2;
	printf("sum is: %f",sum);

	return EXIT_SUCCESS;
}
