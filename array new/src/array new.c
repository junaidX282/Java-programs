/*
 ============================================================================
 Name        : array.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,limit[100],size,searchkey,flag=0;

	setbuf(stdout,NULL);
	printf("enter array size");
	scanf("%d",&size);
	printf("enter values:");
	for(i=0;i<size;i++){
		scanf("%d",&limit[i]);
	}
	printf("values are:");
	for(i=0;i<size;i++){
		printf("%d\t",limit[i]);
	}
	printf("\n> enter search key:");
	scanf("%d",&searchkey);
	for(i=0;i<size;i++){
		if(searchkey==limit[i]){
			flag=1;
			break;
		}
	}
	if(flag==1){
		printf("value position %d",i+1);
	}else{
		printf("not found value");
	}
	return EXIT_SUCCESS;
}
