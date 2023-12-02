/*
 ============================================================================
 Name        : lastfunction.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
int sub();
int main(void) {
	int result;
	setbuf(stdout,NULL);
	result=sub();
	printf("result is:%d",result);
	return EXIT_SUCCESS;
}
int sub(){
	int a,b,c;
	printf("enter two number:");
	scanf("%d%d",&a,&b);
	c=a-b;
	return c;
}
