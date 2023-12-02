/*
 ============================================================================
 Name        : posorneg.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int a,b,c;
	setbuf(stdout,NULL);
	printf("enter three number");
	scanf("%d %d %d",&a,&b,&c);

	if(a>b){
		if(a>c)
		printf(" grater is :%d",a);

	} if(b>c){
		if(b>a)
		printf("grater is :%d",b);
	}
	else{
		printf("grater is:%d",c);
	}
	return EXIT_SUCCESS;
}
