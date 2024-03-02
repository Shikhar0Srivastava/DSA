import java.util.Arrays;
import java.util.Scanner;

public class setMatrixZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    /*------------------------ APPROACH 1 [O(m+n)] ------------------------*/
//    public static void setZeroes(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//
//        int[] rowZeros = new int[m];
//        int[] colZeros = new int[n];
//
//        for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                if (matrix[i][j]==0){
//                    rowZeros[i] = 1;
//                    colZeros[j] = 1;
//                }
//            }
//        }
//        for (int i=0;i<m;i++){
//            for (int j=0; j<n;j++){
//                if (rowZeros[i]==1 || colZeros[j]==1){
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }

    /*--------------------------- APPROACH 2 [O(1)] -------------------------*/
    public static void setZeroes(int[][] matrix) {
//        row = matrix[i][0]
//        col = matrix[0][i]

        int m = matrix.length;
        int n = matrix[0].length;

        int col0 = 1;

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j == 0) {
                        col0 = 0;
                    } else {
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for (int i=1; i<m; i++){
            for (int j=1; j<n; j++){
                if (matrix[i][j] != 0){
                    if (matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int i=0; i<n; i++){
                matrix[0][i] = 0;
            }
        }

        if (col0 == 0){
            for (int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
