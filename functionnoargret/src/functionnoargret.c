/*
 ============================================================================
 Name        : functionnoargret.c
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
	sum();
	return EXIT_SUCCESS;
}
void sum(){
	int a,b,sum;
	setbuf(stdout,NULL);
	printf("enter 2 numbers");
	scanf("%d %d",&a,&b);
	sum=a+b;
	printf("sum is %d\n",sum);
}
