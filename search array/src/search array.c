/*
 ============================================================================
 Name        : search.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,limit,range[100],search,flag;
	setbuf(stdout,NULL);
	printf("enter array size:");
	scanf("%d",&limit);
	printf("enter values:");
	for(i=0;i<limit;i++){
		scanf("%d",&range[i]);
	}
	printf("values are:");
	for(i=0;i<limit;i++){
		printf("%d\t",range[i]);
	}
	printf("\n search value:");
	scanf("%d",&search);
	for(i=0;i<limit;i++){
		if(search==range[i]){
			flag=1;
			break;
		}
	}
	if(flag==1){
		printf("value found at position %d",i+1);
	}
	else{
		printf("value not found");
	}

	return EXIT_SUCCESS;
}
