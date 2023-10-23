package zzTesting;

public class tesfabonacci3 {

    public static long Recursive(int n) {
        if (n <= 0 || n <= 1) {
            return n;
        }
        return Recursive(n - 1) + Recursive(n - 2);
    }

    public static long Iterative(int n) {
        if (n <= 1) {
            return n;
        }

        long fib1 = 1, fib2 = 0, result = 1;
        for (int i = 2; i <= n; i++) {
            result = fib1 + fib2;
            fib2 = fib1;
            fib1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 45};

        System.out.println("Fibonacci Sequence using Recursive:");
        for (int n : numbers) {
            System.out.println("F(" + n + ") = " + Recursive(n));
        }

        System.out.println("\nFibonacci Sequence using Iterative:");
        for (int n : numbers) {
            System.out.println("F(" + n + ") = " + Iterative(n));
        }
    }
}


