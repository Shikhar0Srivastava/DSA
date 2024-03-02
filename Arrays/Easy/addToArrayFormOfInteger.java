import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class addToArrayFormOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(addToArrayForm(num, k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> numList = reverseArray(num);
        int i=0;
        while (k != 0){
            int digit = k%10;
            if(i < numList.size()){
                numList.set(i, numList.get(i) + digit);
            } else {
                numList.add(digit);
            }

            int carry = numList.get(i)/10;
            numList.set(i, numList.get(i)%10);

            k = k/10;
            k += carry;

            i++;
        }

        Collections.reverse(numList);
        return numList;
    }
    static List<Integer> reverseArray(int[] arr){
        List<Integer> newArray = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            newArray.add(arr[arr.length-1-i]);
        }
        return newArray;
    }
}
