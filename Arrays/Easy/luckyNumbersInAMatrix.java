import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class luckyNumbersInAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        for (int[] value : matrix) {
            int minIndex = minIndexFinder(value);
            boolean isLucky = true;
            for (int[] ints : matrix) {
                if (value[minIndex] < ints[minIndex]) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                arr.add(value[minIndex]);
            }
        }
        return arr;
    }
    static int minIndexFinder(int[] row){
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<row.length; i++){
            if(row[i] < min){
                min = row[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
