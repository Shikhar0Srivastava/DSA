import java.util.Arrays;
import java.util.Scanner;

public class shuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2*n];
        for(int i=0; i<2*n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    static int[] shuffle(int[] nums, int n){
        int[] arr = new int[2*n];
        for(int i=0;i<n;i++){
            arr[2*i] = nums[i];
            arr[(2*n)-(2*i)-1] = nums[(2*n)-1-i];
        }
        return arr;
    }
}
