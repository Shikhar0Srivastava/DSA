import java.util.Scanner;

public class minimumCostToMoveChipsToSamePosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] position = new int[n];
        for (int i=0;i<n;i++){
            position[i] = sc.nextInt();
        }
        System.out.println(minCostToMoveChips(position));
    }
    public static int minCostToMoveChips(int[] position) {
        int evenCount = 0, oddCount = 0, evenMax = 0, oddMax = 0;
        for (int pos: position){
            if (pos % 2 == 0){
                evenCount++;
                evenMax = Math.max(evenMax, pos);
            } else {
                oddCount++;
                oddMax = Math.max(oddMax, pos);
            }
        }
        return Math.min(oddCount, evenCount);
    }
}
