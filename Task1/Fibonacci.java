/*public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}*/

//rectified code
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0 ||n==1)
                return n;
            else
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        if (result == -1)
            System.out.println("Wrong input!");
        else
            System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}


