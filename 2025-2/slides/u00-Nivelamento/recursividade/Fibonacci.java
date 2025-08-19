// 0 1 1 2 3 5 8 13 21
import java.util.Scanner;

class Fibonacci {

    public static int fibonacci(int n) {
        int n1 = 0, n2 = 1, fib = 0;
        if(n > 1) {
            for(int i = 0; i < n-2; i++) {
                fib = n1+n2;
                n1 = n2;
                n2 = fib;
            }
        }

        return fib;
    }

    public static int fibonacciRec(int n) {
        int fib;
        if(n == 1) fib = 0;
        else if(n == 2) fib = 1;
        else {
            fib = fibonacciRec(n-1) + fibonacciRec(n-2);
        }

        return fib;
    }

    public static void main(String[] args) {
        
        int n = 5;

        System.out.println(fibonacci(n));
        System.out.println(fibonacciRec(n));
    }
}