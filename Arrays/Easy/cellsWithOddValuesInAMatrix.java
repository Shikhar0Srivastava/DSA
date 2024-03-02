import java.util.Scanner;

public class cellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int times = sc.nextInt();
        int[][] indices = new int[times][2];
        for(int i=0;i<times;i++){
            for(int j=0;j<2;j++){
                indices[i][j] = sc.nextInt();
            }
        }
        System.out.println(oddCells(m, n, indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[] rowIncrement = new int[m];
        int[] colIncrement = new int[n];
        for(int[] rows: indices){
            rowIncrement[rows[0]]++;
            colIncrement[rows[1]]++;
        }
        int rowEven = 0, rowOdd = 0, colEven = 0, colOdd = 0;
        for(int increment: rowIncrement){
            if(increment%2==0){
                rowEven++;
            } else{
                rowOdd++;
            }
        }
        for(int increment: colIncrement){
            if(increment%2==0){
                colEven++;
            } else {
                colOdd++;
            }
        }
        return (rowOdd*colEven) + (rowEven*colOdd);
    }
}
