/*
 ============================================================================
 Name        : switch.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int choice;
	setbuf(stdout,NULL);
	printf("enter your choice \n1 for porotta \n2 for biriyani \n3 for mandhi \n4 for chappathi \n5 for frydays  ");
	scanf("%d",&choice);
	switch(choice){
	case 1:
		printf("your selected for porotta");
		break;
	case 2:
			printf("your selected for biriyani");
			break;
	case 3:
			printf("your selected for mandhi");
			break;
	case 4:
			printf("your selected for chappathi");
			break;
	case 5:
			printf("your selected for fridays");
			break;
	default :
		printf("wrong choice");
	}
	return EXIT_SUCCESS;
}
