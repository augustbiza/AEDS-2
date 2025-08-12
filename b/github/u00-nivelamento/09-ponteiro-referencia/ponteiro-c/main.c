#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

int main() {
    
    int arr[3];
    arr[0] = 1;
	arr[1] = 2;
	arr[2] = 3;
	
	int* ptr = arr;
	
	printf("%d\n", *ptr);		//1
	ptr++;
	printf("%d\n", *ptr);		//2
	ptr++;
	printf("%d\n", *ptr);		//3

    return 0;
}