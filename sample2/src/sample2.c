/*
 ============================================================================
 Name        : sample2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
int a(int,int);
int main(void) {
	int num1,num2,result;
	setbuf(stdout,NULL);
	printf("enter two numbers:");
	scanf("%d%d",&num1,&num2);
	result=a(num1,num2);
	printf("result is %d",result);
	return EXIT_SUCCESS;
}
int a(int n1,int n2){
	int res;
	res=n1/n2;
	return res;
}
