import java.util.HashMap;
import java.util.Scanner;

public class numberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(numIdenticalPairs(nums));
    }


    /*----------------- BRUTE FORCE ---------------------*/
//    static int numIdenticalPairs(int[] nums){
//        int result = 0;
//        for(int i=0;i<nums.length-1;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i] == nums[j]){
//                    result++;
//                }
//            }
//        }
//        return result;
//    }


    /*------------------ EFFICIENT 1 ------------------*/
//    static int numIdenticalPairs(int[] nums){
//        int result = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int number: nums){
//            map.put(number, map.getOrDefault(number, 0)+1);
//        }
//        for(int number: nums){
//            if(map.isEmpty()){
//                break;
//            }
//            result += (map.get(number) * (map.get(number)-1))/2;
//            map.remove(number);
//        }
//        return result;
//    }


    /*------------------- EFFICIENT 2 ------------------*/
    static int numIdenticalPairs(int[] nums){
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int number: nums){
            if(map.containsKey(number)){
                result += map.get(number);
            }
            map.put(number, map.getOrDefault(number, 0)+1);
        }
        return result;
    }
}
