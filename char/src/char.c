/*
 ============================================================================
 Name        : char.c
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
	scanf("%s",&name);
	printf("your name is %s",name);
	return EXIT_SUCCESS;
}
