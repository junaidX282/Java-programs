/*
 ============================================================================
 Name        : sum.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,a[100],sum=0,limit;
	setbuf(stdout,NULL);
	printf("enter array size:");
	scanf("%d",&limit);
	printf("enter values:");

	for(i=0;i<limit;i++){
		scanf("%d",&a[i]);
		sum=sum+a[i];
	}
	printf("entered values are:");
	for(i=0;i<limit;i++){
		printf("%d\t",a[i]);
	}
	printf("\n sum is :%d",sum);
	return EXIT_SUCCESS;
}
