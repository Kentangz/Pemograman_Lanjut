package Alpro;

public class Fibonacci {

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
            result = fib1+fib2;
            fib2=fib1;
            fib1=result;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {100, 300, 500, 800, 1000};
        //System.out.println("Fibonacci Recursive:");
        //for (int n : numbers) {
        //System.out.println("Fib(" + n + ") = " + Recursive(n));
        //}
        //System.out.println("\nFibonacci Iterative:");
        //for (int n : numbers) {
            //System.out.println("Fib(" + n + ") = " + Iterative(n));
        //}

        for (int n : numbers) {
            long startTimeRecursive = System.nanoTime();
            long resultRecursive = Recursive(n);
            long endTimeRecursive = System.nanoTime();
            long executionTimeRecursive = (endTimeRecursive - startTimeRecursive) / 1000000;
            long startTimeIterative = System.nanoTime();
            long resultIterative = Iterative(n);
            long endTimeIterative = System.nanoTime();
            long executionTimeIterative = (endTimeIterative - startTimeIterative) / 1000000;

            System.out.println("n = " + n + " rekursif --> " + executionTimeRecursive + " ms, iteratif --> " + executionTimeIterative + " ms");

        }
    }
}