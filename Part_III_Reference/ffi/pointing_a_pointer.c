#include <stdio.h>

void main() {
  int bar = 45;
  int * foo;     // Create a variable "foo" of type "int *"
  foo = &bar;    // Set foo (the pointer to int) to the address of bar
  printf("%d\n", *foo);
}
