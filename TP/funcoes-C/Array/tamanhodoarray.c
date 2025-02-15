//INT-FLOAT
int arr[] = {1, 2, 3, 4, 5};

int tam = sizeof(arr) / 4;  //sizeof = número total de bytes(20), 4 = número de bytes de um int -> 20/4 = 5

//DOUBLE-LONG
double arr[] = {1.5, 2.5, 3.5, 4.5 , 5.5};

int tam = sizeof(arr) / 8;  //sizeof = número total de bytes(40), 8 = número de bytes de um double -> 40/8 = 5

//CHAR
char arr[] = "ana";

int tam = sizeof(arr) - 1;  //sizeof = número total de bytes(3 = 3 char + \0), -1para tirar o \0 da contagem -> 4-1 = 3