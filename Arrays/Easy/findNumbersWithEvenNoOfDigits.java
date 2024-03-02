import java.util.Scanner;

public class findNumbersWithEvenNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if((num > 9 && num < 100) || (num > 999 && num < 10000) || (num > 99999 && num < 1000000)){
                count++;
            }
        }
        return count;
    }
}
