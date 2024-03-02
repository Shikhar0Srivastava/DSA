import java.util.Arrays;
import java.util.Scanner;

public class buildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    static int[] buildArray(int[] nums){
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
