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
	int i,limit=20,j;
	for(i=1;i<limit;i++){
		for(j=1;j<i;j++){
			printf("%d ",j);

		}
		printf("\n");
	}

	return EXIT_SUCCESS;
}
