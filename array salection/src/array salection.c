/*
 ============================================================================
 Name        : array.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style6

 ============================================================================
 */



#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,j,limit[100],size,temp;
	setbuf(stdout,NULL);
	printf("enter array size");
	scanf("%d",&size);
	printf("enter values:");
	for(i=0;i<size;i++){
		scanf("%d",&limit[i]);
	}
	for(i=0;i<size-1;i++){
		for(j=i+1;j<size;j++){
			if(limit[i]>limit[j]){
				temp=limit[i];
				limit[i]=limit[j];
				limit[j]=temp;
			}
		}
	}
	printf("sort is :");
	for(i=0;i<size;i++){
		printf("%d\t",limit[i]);
	}

	return EXIT_SUCCESS;
}
