import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class spiralMatrix3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int rStart = sc.nextInt();
        int cStart = sc.nextInt();
        System.out.println(Arrays.deepToString(spiralMatrixIII(rows, cols, rStart, cStart)));
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int index = 0;
        int len = 1;
        int size = rows*cols;
        while (ans.size() != size){
//            RIGHT
            for (int i=0;i<len;i++){
                ArrayList<Integer> coordinates = new ArrayList<>();
                coordinates.add(rStart);
                coordinates.add(cStart);
                if ((-1 < rStart && rStart < rows) && (-1 < cStart && cStart < cols)) {
                    ans.add(coordinates);
                }
                cStart++;
            }

//            DOWN
            for (int i=0; i<len; i++){
                ArrayList<Integer> coordinates = new ArrayList<>();
                coordinates.add(rStart);
                coordinates.add(cStart);
                if ((-1 < rStart && rStart < rows) && (-1 < cStart && cStart < cols)) {
                    ans.add(coordinates);
                }
                rStart++;
            }

            len++;

//            LEFT
            for (int i=0; i<len; i++){
                ArrayList<Integer> coordinates = new ArrayList<>();
                coordinates.add(rStart);
                coordinates.add(cStart);
                if ((-1 < rStart && rStart < rows) && (-1 < cStart && cStart < cols)) {
                    ans.add(coordinates);
                }
                cStart--;
            }

//            UP
            for (int i=0;i<len;i++){
                ArrayList<Integer> coordinates = new ArrayList<>();
                coordinates.add(rStart);
                coordinates.add(cStart);
                if ((-1 < rStart && rStart < rows) && (-1 < cStart && cStart < cols)) {
                    ans.add(coordinates);
                }
                rStart--;
            }

            len++;
        }

        int[][] loc = new int[size][2];
        for (ArrayList<Integer> arr: ans){
            loc[index] = new int[]{arr.get(0), arr.get(1)};
            index++;
        }
        return loc;
    }
}
