/*
 ============================================================================
 Name        : multiple.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */
#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int n,i,r=0;
	setbuf(stdout,NULL);
	printf("enter number");
	scanf("%d",&n);
	for(i=1;i<=10;i++){
		r=i*n;
		printf("%d * %d = %d\n",i,n,r);

	}


	return EXIT_SUCCESS;
}
