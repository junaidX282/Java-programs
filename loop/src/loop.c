/*
 ============================================================================
 Name        : loop.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i;sum=0;
	setbuf(stdout,NULL);
	for(i=1;i<15;i++){
		if(i%2==1){
			sum=sum+i;
			printf("%d\n",sum);
		}

	}
	return EXIT_SUCCESS;
}
