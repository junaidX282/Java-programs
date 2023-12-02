/*
 ============================================================================
 Name        : gradeassig.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int n;
	setbuf(stdout,NULL);
	printf("enter your percentage");
	scanf("%d",&n);
	if(n>=90){
		printf("your grade is: A");
	}
	else if(n>=80){
		printf("your grade is: B ");
	}
	else if(n>=70){
		printf("your grade is: C ");
	}
	else if(n>=60){
		printf("your grade is: D ");

	}
	else if(n>=50){
		printf("your grade is: E ");

	}
	else if(n>0){
		printf("your grade is: fail ");

	}

	return EXIT_SUCCESS;
}
