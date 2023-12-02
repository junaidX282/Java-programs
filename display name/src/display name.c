/*
 ============================================================================
 Name        : display.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	char a[20];
	setbuf(stdout,NULL);
	printf("enter your name");
	scanf("%s",&a);
	printf("ur name is :%s",a);
}
