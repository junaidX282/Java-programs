/*
 ============================================================================
 Name        : multiplication.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,n,m;
	setbuf(stdout,NULL);
	printf("enter a number");
	scanf("%d",&n);
	for(i=1;i<=10;i++){
		m=i*n;
		printf("%d * %d = %d\n",i,n,m);
	}
	return EXIT_SUCCESS;
}
