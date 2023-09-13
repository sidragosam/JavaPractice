public class Fibonacci {
    public static int nthFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be a positive integer");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
}
