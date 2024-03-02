import java.util.Scanner;

public class checkIfSentenceIsPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence){
        int[] charIndexArray = new int[26];
        for(char c: sentence.toCharArray()) {
            charIndexArray[((int) c) - 'a']++;
        }
        for(int i: charIndexArray){
            if(i==0){
                return false;
            }
        }
        return true;
    }
}
