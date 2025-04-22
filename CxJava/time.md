# Como medir a duração em segundos de um algoritmo
## C - clock();
``` c
#include <stdio.h>
#include <time.h>

int main(void) {
    
    clock_t inicio = clock();
    
    for(int i = 0; i < 1000000; i++);
    
    clock_t fim = clock();
    
    double tempo = (double)(fim-inicio)/CLOCKS_PER_SEC;
    
    printf("Tempo: %f seg\n", tempo);
    
    return 0;
}
```

## Java - nanoTime()
```java
import java.time.*;

public class Main {
    
	public static void main(String[] args) {
		
		Long inicio = System.nanoTime();
		
		for(int i = 0; i < 1000000; i++);
        
        Long fim = System.nanoTime();
        
        double tempo = (double)(fim-inicio)/1000000000;
        
        System.out.println("Tempo: " + tempo + " seg");
	}
}
```