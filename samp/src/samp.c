/*
 ============================================================================
 Name        : samp.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
void mul(int,int);
int main(void) {
	int a,b;
	setbuf(stdout,NULL);
	printf("enter two num");
	scanf("%d %d",&a,&b);
	mul(a,b);
	return EXIT_SUCCESS;
}
void mul(int num1,int num2){
int result;
result=num1*num2;
printf("result is:%d",result);
}

