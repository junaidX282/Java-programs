/*
 ============================================================================
 Name        : sumarray2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,a[10],limit,sum=0;
	setbuf(stdout,NULL);
	printf("enter array limit");
	scanf("%d",&limit);
	printf("enter array values:");
	for(i=0;i<limit;i++){
	scanf("%d",&a[i]);
	}

	for(i=0;i<limit;i++){
		sum=sum+a[i];

	}
	printf("array sum is :%d",sum);

	return EXIT_SUCCESS;
}
