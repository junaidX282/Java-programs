/*
 ============================================================================
 Name        : sort1.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a[10],j,temp,i,limit;
	setbuf(stdout,NULL);
	printf("enter array size:");
	scanf("%d",&limit);
	printf("enter array value:");
	for(i=0;i<limit;i++){
		scanf("%d",&a[i]);
	}
	printf("sort is:");
	for(i=0;i<limit-1;i++){
		for(j=i+1;j<limit;j++){
			if(a[j]>a[i]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}printf("sort is: ");
	for(i=0;i<=limit;i++){
		printf("%d\t",a[i]);
	}
	return EXIT_SUCCESS;
}
