import java.util.Arrays;
import java.util.Scanner;

public class spiralMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int rowStart = 0, colStart = 0;
        int rowEnd = n-1, colEnd = n-1;

        int digit = 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i=colStart; i<= colEnd; i++){
                matrix[rowStart][i] = digit;
                digit++;
            }
            rowStart++;

            for (int i=rowStart; i<= rowEnd; i++){
                matrix[i][colEnd] = digit;
                digit++;
            }
            colEnd--;

            if (rowStart <= rowEnd){
                for (int i=colEnd; i>=colStart; i--){
                    matrix[rowEnd][i] = digit;
                    digit++;
                }
                rowEnd--;
            }

            if (colStart <= colEnd){
                for (int i=rowEnd; i>= rowStart; i--){
                    matrix[i][colStart] = digit;
                    digit++;
                }
                colStart++;
            }
        }
        return matrix;
    }
}
