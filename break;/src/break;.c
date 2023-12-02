/*
 ============================================================================
 Name        : break;.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,result,m;
	setbuf(stdout,NULL);
	printf("enter a number");
	scanf("%d",&m );
	for(i=1;i<=10;i++){
		result=i*m;
		printf("%d * %d = %d \n", i ,m,result);

	}

	return EXIT_SUCCESS;
}
