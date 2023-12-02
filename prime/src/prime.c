/*
 ============================================================================
 Name        : prime.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int n,i,flag=0;
	setbuf(stdout,NULL);
	printf("ENTER A NUMBER");
	scanf("%d",&n);
	for(i=2;i<n/2;i++){
		if(n%i==0){
			flag=1;
			break;
		}

	}
	 if(flag==0){


		printf("number is prime");
	}
	else{
		printf("number is not prime");
	}
	return EXIT_SUCCESS;
}
