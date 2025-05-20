package Patterns;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // Print 1 if the sum of row and column indices is even, else print 0
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }
}
