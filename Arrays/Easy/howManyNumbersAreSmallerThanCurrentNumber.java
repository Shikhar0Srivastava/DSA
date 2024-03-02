import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class howManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    /*------------------- BRUTE FORCE ----------------*/
//    static int[] smallerNumbersThanCurrent(int[] nums){
//        int n = nums.length;
//        int[] result = new int[n];
//        for(int i=0;i<n;i++){
//            int smaller = 0;
//            for(int j=0;j<n;j++){
//                if(nums[j]<nums[i]){
//                    smaller++;
//                }
//            }
//            result[i] = smaller;
//        }
//        return result;
//    }


    /*---------------EFFICIENT ----------------*/
    static int[] smallerNumbersThanCurrent(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int maximum = 0;
        for(int number: nums){
            maximum = Math.max(maximum, number);
        }
        int[] countBucket = new int[maximum + 1];
        for(int number: nums){
            countBucket[number]++;
        }
        int[] lowerCountBucket = new int[maximum+1];
        int lowerSum = 0;
        for(int i=0;i<maximum+1;i++){
            lowerCountBucket[i] = lowerSum;
            lowerSum += countBucket[i];
        }
        for(int i=0;i<n;i++){
            result[i] = lowerCountBucket[nums[i]];
        }
        return result;
    }
}
