/*
 ============================================================================
 Name        : function.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
int sum(int,int);
int main(void) {
	int a,b,c;
	setbuf(stdout,NULL);
	printf("enter two numbers");
	scanf("%d %d",&a,&b);
	c=sum(a,b);
	printf("result is %d",c);
	return EXIT_SUCCESS;
}
int sum(int a,int b){
	int d;
	d=a+b;
	return d;
}
