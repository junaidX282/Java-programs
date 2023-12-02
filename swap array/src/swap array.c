/*
 ============================================================================
 Name        : swap.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,limit[100],values1,limit2[100],temp[100];
	setbuf(stdout,NULL);
	printf("enter array size");
	scanf("%d",&values1);
	printf("enter values of array 1:");
	for(i=0;i<values1;i++){
		scanf("%d",&limit[i]);
	}

		printf("enter values of array 2:");
		for(i=0;i<values1;i++){
			scanf("%d",&limit2[i]);
	}
		for(i=0;i<values1;i++){
			temp[i]=limit[i];
			limit[i]=limit2[i];
			limit2[i]=temp[i];
		}
		printf("after swapping to arrays\n array 1 is:");
		for(i=0;i<values1;i++){
			printf("%d\t",limit[i]);
		}
		printf("array 2 is:");

		for(i=0;i<values1;i++){
			printf("%d",limit2[i]);
		}
	return EXIT_SUCCESS;
}

