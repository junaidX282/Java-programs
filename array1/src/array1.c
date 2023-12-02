/*
 ============================================================================
 Name        : array1.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a[10],i,limit;
	setbuf(stdout,NULL);
	printf("enter array size");
	scanf("%d",&limit);
	printf("enter values:");
	for(i=0;i<limit;i++){
	scanf("%d",&a[i]);
	}
	printf(" array values:");
	for(i=0;i<limit;i++){
		printf("  %d",a[i]);
	}
	return EXIT_SUCCESS;
}
