/*
 ============================================================================
 Name        : fnArray.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
void getArray();
int main(void) {
	getArray();
	return EXIT_SUCCESS;
}
	void getArray(){
		int i,a[20],size;
		setbuf(stdout,NULL);
		printf("array size:");
		scanf("%d",&size);
		printf("enter array values:");
		for(i=0;i<size;i++){
			scanf("%d",&a[i]);
		}
		printf(" values:");
		for(i=0;i<size;i++){
		printf(" %d",a[i]);
		}
	}
