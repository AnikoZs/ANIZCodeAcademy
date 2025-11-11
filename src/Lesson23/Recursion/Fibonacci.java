package Lesson23.Recursion;

public class Fibonacci {


        // Recursive method to calculate nth Fibonacci number
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n; // base cases: fibonacci(0) = 0, fibonacci(1) = 1
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2); // recursive calls
            }
        }

        public static void main(String[] args) {
            int number = 10; // change this to get more Fibonacci numbers
            System.out.println("Fibonacci sequence up to " + number + ":");
            for (int i = 0; i < number; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

