package random;

public class diamond {
    public static void main(String[] args) {
        int rows = 4; // Number of rows for the upper triangle (and the middle row)

        // Upper triangle (upward-pointing)
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars for the upper triangle
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower triangle (downward-pointing)
        for (int i = rows - 1; i >= 1; i--) { // Start from the third row of the first triangle
            // Print leading spaces for the downward triangle
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars for the downward triangle
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
