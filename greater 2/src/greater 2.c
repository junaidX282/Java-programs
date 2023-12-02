/*
 ============================================================================
 Name        : greater.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */
#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int n1,n2,n3;
	setbuf(stdout,NULL);
	printf("enter three numbers");
	scanf("%d %d %d",&n1,&n2,&n3);
	if(n1>n2 && n1>n3){

		printf("grater is %d",n1);
	}
	 else if(n2>n1 && n2>n3){

		printf("grater is %d",n2);
	}else{
		printf("greater is %d",n3);
	}

	return EXIT_SUCCESS;
}
