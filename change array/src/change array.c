/*
 ============================================================================
 Name        : change.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,limit[100],values1,values2,limit2[100];
	setbuf(stdout,NULL);
	printf("enter array size");
	scanf("%d",&values1);
	printf("enter values of array 1:");
	for(i=0;i<values1;i++){
		scanf("%d",&limit[i]);
	}
	printf("enter array2 size");
		scanf("%d",&values2);
		printf("enter values of array 2:");
		for(i=0;i<values2;i++){
			scanf("%d",&limit2[i]);


	}
	printf("end");
	return EXIT_SUCCESS;
}
