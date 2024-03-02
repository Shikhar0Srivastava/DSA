import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for(int i=0;i<n;i++){
            candies[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();
        for(boolean result: kidsWithCandies(candies, extraCandies)){
            System.out.println(result);
        }
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int max = -1;
        for(int candy: candies){
            max = Math.max(max, candy);
        }
        List<Boolean> answer = new ArrayList<>();
        for(int candy: candies){
            if(candy + extraCandies >= max){
                answer.add(true);
            } else{
                answer.add(false);
            }
        }
        return answer;
    }
}
