import java.util.Scanner;

public class maximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum = nums[0], maxSum = nums[0];
        int i=0, j=1;
        while (j < nums.length){
            if (sum + nums[j] < nums[j]){
                sum = nums[j];
                i = j;
            } else {
                sum = sum + nums[j];
            }
            j++;
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
