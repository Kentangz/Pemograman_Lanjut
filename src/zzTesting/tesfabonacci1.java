package zzTesting;

public class tesfabonacci1 {
    public static void main(String[] args) {
        int n = 14,fib1,fib2, result;
        fib1=1;
        fib2=0;
        result=1;
                for (int i=1; i<=n; i++){
                    System.out.println("nilai n " + i + " = " + result);
                    result = fib1+fib2;
                    fib2=fib1;
                    fib1=result;
                }
        System.out.println(" ");
    }
}