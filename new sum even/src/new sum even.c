/*
 ============================================================================
 Name        : new.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,limit=5,sum=0;
	setbuf(stdout,NULL);
	for(i=1;i<=limit;i++){
		sum=sum+i;
	}

		printf("%d\n",sum);


	return EXIT_SUCCESS;
}

