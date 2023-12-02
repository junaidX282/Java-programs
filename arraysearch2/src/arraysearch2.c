/*
 ============================================================================
 Name        : arraysearch2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,limit,values[10],searchkey,fla=0;
	setbuf(stdout,NULL);
	printf("enter array size:");
	scanf("%d",&limit);
	printf("enter array value:");
	for(i=0;i<limit;i++){
		scanf("%d",&values[i]);
	}
	printf("enter search key:");
	scanf("%d",&searchkey);
	for(i=0;i<limit;i++){
		if(searchkey==values[i]){
			fla=1;
			break;
		}
	}
	if(fla==1){
		printf("value at position:%d",i+1);
	}
	else{
		printf("value not found");
	}




	return EXIT_SUCCESS;
}
