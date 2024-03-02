import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
    }

    /*------------------------ APPROACH 1 -------------------------*/
//    public static int removeDuplicates(int[] nums) {
//        int size = nums.length;
//        int index = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i=0; i<size;i++){
//            if (!map.containsKey(nums[i])){
//                nums[index] = nums[i];
//                map.put(nums[i], 1);
//                index++;
//            } else {
//                map.put(nums[i], map.get(nums[i])+1);
//            }
//        }
//        return index;
//    }

    /*------------------------ APPROACH 2 ----------------------*/
    public static int removeDuplicates(int[] nums) {
        int leftPointer = 1, rightPointer = 1;
        for (; rightPointer<nums.length;rightPointer++){
            if (nums[leftPointer] != nums[rightPointer]){
                nums[leftPointer] = nums[rightPointer];
                leftPointer++;
            }
        }
        return leftPointer-1;
    }
}
