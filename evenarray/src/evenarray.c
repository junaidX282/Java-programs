/*
 ============================================================================
 Name        : evenarray.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int array[10],i,sum=0,limit;
	setbuf(stdout,NULL);
	printf("enter array size:");
	scanf("%d",&limit);
	printf("enter array values:");
	for(i=0;i<limit;i++){
		scanf("%d",&array[i]);
	}
	for(i=0;i<limit;i++){
		if(array[i]%2==0){
			sum=sum+1;
		}
	}
	printf(" number of even numbers in array: %d",sum);
	return EXIT_SUCCESS;
}
