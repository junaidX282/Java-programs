/*
 ============================================================================
 Name        : loop2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,sum=0,n;
	setbuf(stdout,NULL);
	printf("enter a number");
	scanf("%d",&n);
	for(i=1;i<=n;i++){

		sum=sum+i;
	}
	printf("sum is %d",sum);
	return EXIT_SUCCESS;
}
