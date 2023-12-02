/*
 ============================================================================
 Name        : reverse.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,limit;
	setbuf(stdout,NULL);
	printf("enter a number");
	scanf("%d",&limit);
	for(i=limit;i<=limit;i--){
		printf("%d ",i);
		if(i==0){
			break;
		}
	}

	return EXIT_SUCCESS;
}
