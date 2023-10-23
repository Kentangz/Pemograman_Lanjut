package zzTesting;

public class tesfabonacci2 {
        public static void main(String[] args) {
            int n = 10,fib1,fib2, result;
            fib1=0;
            fib2=1;
            result=0;
            for (int i=2; i<=n; i++){
                System.out.println("nilai n " + i + " = " + result);
                result = fib1 + fib2;
                fib1 = fib2;
                fib2 = result;
            }

        }
    }

