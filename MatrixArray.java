import java.util.*;

public class MatrixArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        // Declaration of 2D array
        // type[][] arrayName = new type[rows][columns];
        // int[][] numbers = new int[3][5];
        int[][] numbers = new int[rows][cols];
        // input
        // row
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}
// print: The print method is used to display text or other data on the same
// line without moving the cursor to a new line. It does not add a newline
// character (\n) at the end of the output, so the next output will appear
// immediately after the current output.
// println: The println method, on the other hand, is used to display text or
// data and then move the cursor to a new line. It automatically adds a newline
// character at the end of the output, so the next output will appear on a new
// line.