*
 ============================================================================
 Name        : fnNew.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
void Array(int);
int main(void) {
	int i,a[20],size;
	setbuf(stdout,NULL);
	printf("enter array size:");
	scanf("%d%d",&size);
	printf("enter array values:");
	for(i=0;i<size;i++){
		scanf("%d",&a[i]);

	}
	getArray();


	return EXIT_SUCCESS;
}
void Array(int num[]){
	int i;
	setbuf(stdout,NULL);
	printf("values:");
	for(i=0;i<5;i++){
		printf("%d",num[]);

	}

}

