import java.util.Arrays;
import java.util.Scanner;

public class findNUniqueIntegersSumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        int i=0;
        if(n%2!=0){
            ans[0] = 0;
            i = 1;
        }
        int max = n/2;
        for(; i<n;i++){
            if(max == 0){
                max = max-1;
            }
            ans[i] = max;
            max--;
        }
        return ans;
    }
}
