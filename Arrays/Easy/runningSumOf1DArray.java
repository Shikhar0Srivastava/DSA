import java.util.Arrays;
import java.util.Scanner;

public class runningSumOf1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums){
        int sum = 0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
