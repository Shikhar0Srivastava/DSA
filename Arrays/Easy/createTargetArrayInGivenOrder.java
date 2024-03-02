import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class createTargetArrayInGivenOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int[] index = new int[size];
        for(int i=0;i<size;i++){
            index[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    /*---------------- SOLUTION USING ARRAY ------------------*/
//    static int[] shiftRight(int[] nums, int indexToShift){
//        int[] newNum = new int[nums.length + 1];
//        for(int i=0;i<indexToShift;i++){
//            newNum[i] = nums[i];
//        }
//        indexToShift = indexToShift+1;
//        for(int i=indexToShift;i<newNum.length;i++){
//            newNum[i] = nums[i-1];
//        }
//        return newNum;
//    }
//    static void addToArrayAtIndex(int[] nums, int indexWhereAdd, int numToAdd){
//        nums[indexWhereAdd] = numToAdd;
//    }
//    static int[] createTargetArray(int[] nums, int[] index){
//        int n = nums.length;
//        int[] targetArray = new int[0];
//        for(int i=0;i<n;i++){
//            targetArray = shiftRight(targetArray, index[i]);
//            addToArrayAtIndex(targetArray, index[i], nums[i]);
//        }
//        return targetArray;
//    }

    /*------------------- SOLUTION USING ARRAYLIST ----------------------*/
    static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(index[i], nums[i]);
        }
        int[] targetArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            targetArray[i] = arr.get(i);
        }
        return targetArray;
    }
}
