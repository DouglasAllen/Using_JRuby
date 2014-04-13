#include <stdio.h>
#include <string.h>

int main()
{

	char str[] = "Hello";
	char* p;
	int I;

	p = &str[0];

	printf("Address start of string Hello: %u", p);

	for(I = 0; I < strlen(str); I++)
	{
		printf("\nValue at Address %u : %c", p+I, *(p+I));
    printf("\nValue at Address %u : %c", p+I, str[I]);
	}

	printf("\n");

	for(I = 0; I<5; I++)
	{
		printf("\nValue  %c",  *p + I);
	}	

	return 0;
}
