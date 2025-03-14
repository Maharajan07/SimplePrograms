package random;

public class DoubleTrianglePattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows for the upper triangle

        // Create an array to store the pattern
        char[][] pattern = new char[2 * rows - 1][2 * rows - 1];

        // Initialize the array with spaces
        for (int i = 0; i < 2 * rows - 1; i++) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                pattern[i][j] = ' ';
            }
        }

        // Upper triangle (upward-pointing)
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i - 1; j <= rows + i - 1; j++) {
                pattern[i][j] = '*';
            }
        }

        // Lower triangle (downward-pointing), starting from the third row of the first triangle
        for (int i = 1; i < rows; i++) {
            for (int j = rows - i - 1; j <= rows + i - 1; j++) {
                pattern[rows + i - 2][j] = '*';
            }
        }

        // Print the pattern
        for (int i = 0; i < 2 * rows - 1; i++) {
            for (int j = 0; j < 2 * rows - 1; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}
