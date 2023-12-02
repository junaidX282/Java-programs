/*
 ============================================================================
 Name        : dfgy.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a,b;
	setbuf(stdout,NULL);
	printf("enter two numbers:");
	scanf(" %d %d",&a,&b);
	printf("you have entered %d\n %d",a,b);
	return EXIT_SUCCESS;
}

