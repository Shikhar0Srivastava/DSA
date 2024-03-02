import java.util.Scanner;

public class matrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            sum += mat[i][i];
            if(i != mat.length-i-1){
                sum += mat[i][mat.length-i-1];
            }
        }
        return sum;
    }
}
