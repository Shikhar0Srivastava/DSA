import java.util.Arrays;
import java.util.Scanner;

public class findHighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] gain = new int[size];
        for(int i=0;i<size;i++){
            gain[i] = sc.nextInt();
        }
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] heights = new int[n+1];
        for(int i=0;i<n;i++){
            heights[i+1] = gain[i]+heights[i];
        }
        int max = 0;
        for(int height: heights){
            max = Math.max(height, max);
        }
        return max;
    }
}
