/*
 ============================================================================
 Name        : grade.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */



#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int mark;
	setbuf(stdout,NULL);
	printf("enter your mark");
	scanf("%d",&mark);
	printf("u entered %d",mark);
	if(mark<=90){
		printf("grade is A");
    }else if(mark<=80){
    	printf("grade is B");
    }else if(mark<=70){
    	printf("grade is c");
    }else if(mark<=60){
    	printf("grade is d");
    }else if(mark<=50){
    	printf("grsde is e");
    }else if(mark<50){
    	printf("you are failed");

    }
	return EXIT_SUCCESS;
}
