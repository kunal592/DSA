package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        int row = 5; // You can change the number of rows here
        for (int i = 1; i <= row; i++) {
            // Print spaces
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        
    }
}
