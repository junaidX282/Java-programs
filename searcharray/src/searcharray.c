/*
 ============================================================================
 Name        : searcharray.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */



#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,limit,values[10],searchkey;
	setbuf(stdout,NULL);
	printf("enter array size:");
	scanf("%d",&limit);
	printf("enter array values:");
	for(i=0;i<limit;i++){
		scanf("%d",&values[i]);
	}
	printf("enter search key:");
	scanf("%d",&searchkey);
	for(i=0;i<limit;i++){
		if(searchkey==values[i]){
			printf("at position of value %d",i+1);
			break;
		}
		else{
			printf("value not found");


		}
	}
	return EXIT_SUCCESS;
}
