/*
 ============================================================================
 Name        : new.c
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
	printf(" 1.for sunday\n 2.for monday\n 3.for tuesday\n 4.for wednesday\n 5.for thursday\n 6.for friday\n 7.for saturday\n enter ur option:");
	scanf("%d",&choice);
	switch(choice){
	case 1:
		printf("you selected sunday");
	    break;
	case 2:
		printf("you selected monday");
	    break;
	case 3:
		printf("you selected tuesday");
	    break;
	case 4:
		printf("you selected wednesday");
		break;
	case 5:
		printf("you selected thursday");
		break;
	case 6:
		printf("you selected friday");
		break;
	case 7:
		printf("you selected saturday");
	    break;
	default :
		printf("invalid entry");

	}

	return EXIT_SUCCESS;
}
