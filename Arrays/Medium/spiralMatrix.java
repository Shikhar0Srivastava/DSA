import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int[] row: matrix){
            int index = 0;
            while (index != n){
                row[index] = sc.nextInt();
                index++;
            }
        }
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();

        if (matrix.length ==0){
            return answer;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int rowStart = 0, colStart = 0;
        int rowEnd = m-1, colEnd = n-1;

        while (rowEnd >= rowStart && colEnd >= colStart){
            for (int i=colStart; i<=colEnd; i++){
                answer.add(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i=rowStart; i<=rowEnd; i++){
                answer.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowEnd >= rowStart){
                for (int i=colEnd; i>= colStart; i--){
                    answer.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            if (colEnd >= colStart){
                for (int i = rowEnd; i>= rowStart; i--){
                    answer.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }

        return answer;
    }
}
