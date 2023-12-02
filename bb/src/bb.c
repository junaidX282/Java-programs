/*
 ============================================================================
 Name        : bb.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	char name[20];
	setbuf(stdout,NULL);
	printf("ENTER YOUR NAME");
	scanf("%c",&name);
	printf("your name is %c",name);
	return EXIT_SUCCESS;
}
