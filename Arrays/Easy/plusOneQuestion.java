import java.util.*;

public class plusOneQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for (int i=0;i<n;i++){
            digits[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int k = 1;
        int index = 0;
        List<Integer> rev = reverseArray(digits);
        while (k != 0){
            if (index < digits.length){
                rev.set(index, rev.get(index)+1);
            } else {
                rev.add(1);
            }
            int carry = rev.get(index)/10;
            rev.set(index, rev.get(index)%10);
            k = k/10;
            k += carry;

            index++;
        }
        Collections.reverse(rev);
        int[] newDig = new int[rev.size()];
        for (int i=0;i<rev.size();i++){
            newDig[i] = rev.get(i);
        }
        return newDig;
    }
    static List<Integer> reverseArray(int[] digits){
        List<Integer> numDigits = new ArrayList<>();
        for (int i=digits.length-1;i>-1;i--){
            numDigits.add(digits[i]);
        }
        return numDigits;
    }
}

