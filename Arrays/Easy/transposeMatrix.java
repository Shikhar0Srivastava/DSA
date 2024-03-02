import java.util.Arrays;
import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString((transpose(matrix))));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] transposedMat = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                transposedMat[i][j] = matrix[j][i];
            }
        }
        return transposedMat;
    }
}
