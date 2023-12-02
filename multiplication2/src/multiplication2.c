/*
 ============================================================================
 Name        : multiplication2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,n,sum;
	setbuf(stdout,NULL);
	printf("ENTER A NUMBER ");
	scanf("%d",&n);
	for(i=1;i<=10;i++){
		sum=n*i;
		printf("%d * %d = %d\n",i,n,sum);
	}
	return EXIT_SUCCESS;
}
