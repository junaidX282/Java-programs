/*
 ============================================================================
 Name        : mark.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int mark;
	setbuf(stdout,NULL);
	printf("enter your mark");
	scanf("%d",&mark);
	if(mark>=50){
		printf("pass");

	}
	else{
			printf("fail");
		}



	return EXIT_SUCCESS;
}
