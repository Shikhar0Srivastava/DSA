import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class countItemsMatchingARule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<List<String>> items = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<String> description = new ArrayList<>();
            for(int j=0;j<3;j++){
                description.add(sc.nextLine());
            }
            items.add(description);
        }
        String ruleKey = sc.nextLine();
        String ruleValue = sc.nextLine();
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int indexFromKey = 0;
        if (ruleKey.equals("color")) {
            indexFromKey = 1;
        } else if (ruleKey.equals("name")){
            indexFromKey = 2;
        }
        for(List<String> iterList : items){
            if(iterList.get(indexFromKey).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
