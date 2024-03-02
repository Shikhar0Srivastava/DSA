import java.util.Arrays;
import java.util.Scanner;

public class determineIfMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] target = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                target[i][j] = sc.nextInt();
            }
        }
        System.out.println(findRotation(mat, target));
    }
    static int[][] anticlockwiseRotation(int[][] matrix){
        matrix = transpose(matrix);
        return reverseMat(matrix);
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
    static int[][] reverseMat(int[][] matrix){
        int[][] reversedMat = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            reversedMat[i] = matrix[matrix.length-i-1];
        }
        return reversedMat;
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = anticlockwiseRotation(mat);
        }
        return false;
    }
}
