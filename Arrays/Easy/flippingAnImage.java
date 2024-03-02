import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class flippingAnImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] image = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                image[i][j] = sc.nextInt();
            }
        }
        for(int[] row: flipAndInvertImage(image)){
            System.out.println(Arrays.toString(row));
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] resultImg = new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            int[] newRow = reverseRow(image[i]);
            flipRow(newRow);
            resultImg[i] = newRow;
        }
        return resultImg;
    }
    static int[] reverseRow(int[] row){
        int[] reversedRow = new int[row.length];
        for(int i=0;i<row.length;i++){
            reversedRow[i] = row[row.length-i-1];
        }
        return reversedRow;
    }
    static void flipRow(int[] row){
        for(int i=0;i<row.length;i++){
            if(row[i]==0){
                row[i] = 1;
            } else{
                row[i] = 0;
            }
        }
    }
}
