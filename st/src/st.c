/*
 ============================================================================
 Name        : st.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,j;
	setbuf(stdout,NULL);
	for(i=1;i<10;i++){
		for(j=10;j>i;j--){
			printf("*\t");
		}
		printf("\n");
	}

	return EXIT_SUCCESS;
}
