/*
 ============================================================================
 Name        : interest.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int p;
	float r,u,si;
	printf("enter principle amount:");
	scanf("%d",&p);
	printf("enter interest:");
	scanf("%f",&r);
	printf("number of years:");
	scanf("%d",&u);
	si=((p*r*u)/100);
	printf("simple interest=%f",si);

	return EXIT_SUCCESS;
}


