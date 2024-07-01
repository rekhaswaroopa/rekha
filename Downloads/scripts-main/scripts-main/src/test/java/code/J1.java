package code;

public class J1 {

        public static void main(String[] args) {
            int n = 10; // Number of Fibonacci numbers to generate
            System.out.println("Generating Fibonacci sequence using iteration:");
            fibonacciIterative(n);
        }

        public static void fibonacciIterative(int n) {
            int a = 0, b = 1;

            System.out.print(a + " " + b + " ");

            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }

