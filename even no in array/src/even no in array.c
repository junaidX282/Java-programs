/*
 ============================================================================
 Name        : even.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */
#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,size,a[100],sum=0;
	setbuf(stdout,NULL);
	printf("ENTER ARRAY SIZE: ");
	scanf("%d",&size);
	printf("enter the values:");
	for(i=0;i<size;i++){
		scanf("%d",&a[i]);
		for(i=0;i<size;i++){
			if(a[i]%2==0){
				sum=sum+a[i];
			}
		}
		printf("%d",sum);

	}
	return EXIT_SUCCESS;
}



