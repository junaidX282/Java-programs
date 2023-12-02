/*
 ============================================================================
 Name        : oddsum2.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,n,sum=0;
	setbuf(stdout,NULL);
	printf("ENTER A NUMBER");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		if(i%2==1){
			sum=sum+i;
		}

	}
	printf("sum is : %d",sum);
	return EXIT_SUCCESS;
}
