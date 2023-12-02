/*
 ============================================================================
 Name        : NEW.c
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
	float r,n,si;
	setbuf(stdout,NULL);
	printf("enter three numbers");
	scanf("%d%f%f",&p,&r,&n);
	si=(p*r*n)/100;
	printf("si is: %f",si);

	return EXIT_SUCCESS;
}
