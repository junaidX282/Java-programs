/*
 ============================================================================
 Name        : multiarray2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,j,limit,values[3][3];
	setbuf(stdout,NULL);
	printf("enter array limit:");
	scanf("%d",&limit);
	printf("enter array values:");

	for(i=0;i<limit;i++){
		for(j=0;j<limit;j++){
		scanf("%d",&values[i][j]);
		}
	}
	printf("array values:\n");
	for(i=0;i<limit;i++){
		for(j=0;j<limit;j++){
		printf("%d\t",values[i][j]);
		}
		printf("\n");
	}
	return EXIT_SUCCESS;
}
