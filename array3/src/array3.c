/*
 ============================================================================
 Name        : array3.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,j,array1[10],limit,array2[10],temp;
	setbuf(stdout,NULL);
	printf("enter array size:");
	scanf("%d",&limit);
	printf("enter array value 1:");
	for(i=0;i<limit;i++){
		scanf("%d",&array1[i]);
	}
	printf("enter array value 2:");
		for(i=0;i<limit;i++){
			scanf("%d",&array2[i]);
		}
		printf("array after swapping:\n");
		for(i=0;i<limit-1;i++){
			for(j=i+1;j<limit;j++){
				if(array1[i]>array1[j]){
					temp=array1[i];
					array1[i]=array1[j];
					array1[j]=temp;
				}
			}
		}
		for(i=0;i<limit-1;i++){
					for(j=i+1;j<limit;j++){
						if(array2[i]>array2[j]){
							temp=array2[i];
							array2[i]=array2[j];
							array2[j]=temp;
						}
					}
				}
		printf("ARRAY1:");
		for(i=0;i<limit;i++){
			printf("%d\t",array1[i]);
		}
		printf("\nARRAY2:");
				for(i=0;i<limit;i++){
					printf("%d\t",array2[i]);
				}

	return EXIT_SUCCESS;
}
