/*
 ============================================================================
 Name        : continue.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i;
	setbuf(stdout,NULL);
	for(i=1;i<=7;i++){
		printf("hi ");
		if(i==5){
			continue;
		}
		printf(" hello ");
		}
	printf("\n       finished");


	return EXIT_SUCCESS;
}
