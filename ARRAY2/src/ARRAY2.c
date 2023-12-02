/*
 ============================================================================
 Name        : ARRAY2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a[100];
	int i,limit;
	setbuf(stdout,NULL);
	printf("enter array size:");
	scanf("%d",&limit);
	printf("enter values:");
	for(i=0;i<limit;i++){
		scanf("%d",&a[i]);
	}
	printf("you have entered :");
	for(i=0;i<limit;i++){
		printf("%d\t",a[i]);
	}
	return EXIT_SUCCESS;
}
