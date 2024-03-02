import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reshapeTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int[] row: mat){
            for(int i=0;i<n;i++){
                row[i] = sc.nextInt();
            }
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }
    /*-------------------------- APPROACH 1 ---------------------------*/
//    public static int[][] matrixReshape(int[][] mat, int r, int c) {
//        int m = mat.length;
//        int n = mat[0].length;
//        if (m*n != r*c){
//            return mat;
//        }
//        List<Integer> numbers = new ArrayList<>();
//        for (int[] rows: mat){
//            for(int num: rows){
//                numbers.add(num);
//            }
//        }
//        int[][] newMat = new int[r][c];
//        for (int[] row: newMat){
//            for(int i=0;i<c;i++){
//                row[i] = numbers.get(0);
//                numbers.remove(0);
//            }
//        }
//        return newMat;
//    }

    /*-------------------------- APPROACH 2 -----------------------*/
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (r*c != m*n){
            return mat;
        }
        if(r==m && c==n){
            return mat;
        }
        int[][] newMatrix = new int[r][c];
        int newIndex = 0, oldIndex = 0;
        while (newIndex < r*c && oldIndex < m*n){
            newMatrix[newIndex/c][newIndex%c] = mat[oldIndex/n][oldIndex%n];
            newIndex++;
            oldIndex++;
        }
        return newMatrix;
    }
}
