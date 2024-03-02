import java.util.Arrays;
import java.util.Scanner;

public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    /*------------------------- APPROACH 1 [O(n)] -----------------------*/
//    public static int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//
//        int[] prefixProduct = new int[n];
//        int[] postfixProduct = new int[n];
//
//        prefixProduct[0] = 1;
//        postfixProduct[n-1] = 1;
//
//        for (int i=0;i<n-1;i++){
//            prefixProduct[i+1] = prefixProduct[i] * nums[i];
//        }
//
//        for (int i=n-1;i>0;i--){
//            postfixProduct[i-1] = postfixProduct[i] * nums[i];
//        }
//
//        for (int i=0; i<n; i++) {
//            ans[i] = prefixProduct[i] * postfixProduct[i];
//        }
//        return ans;
//    }

    /*------------------------ APPROACH 2 [O(1)] ---------------------*/
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        Arrays.fill(ans, 1);

        int product = 1;

        for (int i=0; i<nums.length; i++){
            ans[i] *= product;
            product *= nums[i];
        }

        product = 1;

        for (int i=nums.length-1; i>-1; i--){
            ans[i] *= product;
            product *= nums[i];
        }

        return ans;
    }
}
