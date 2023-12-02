/*
 ============================================================================
 Name        : looop.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,limit,flag=0;
	setbuf(stdout,NULL);
	printf("enter a number");
	scanf("%d",&limit);
	for(i=2;i<=limit/2;i++){
		if(limit%i==0){
			flag=1;
			break;
		}


	}
    if(flag==0){
    	printf("number is prime");

    }else{
    	printf("number is not prime");
    }
	return EXIT_SUCCESS;
}
