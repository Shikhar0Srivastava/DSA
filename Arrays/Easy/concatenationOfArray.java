import java.util.Arrays;
import java.util.Scanner;

public class concatenationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    static int[] getConcatenation(int[] nums){
        int[] arr = new int[(2*nums.length)];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        System.arraycopy(nums, 0, arr, nums.length, nums.length);
        return arr;
    }
}
