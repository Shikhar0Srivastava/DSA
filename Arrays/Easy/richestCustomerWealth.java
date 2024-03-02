import java.util.Scanner;

public class richestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        int maxSum = 0;
        for (int[] account : accounts) {
            maxSum = Math.max(maxSum, arraySum(account));
        }
        return maxSum;
    }
    static int arraySum(int[] row){
        int sum = 0;
        for(int number: row){
            sum += number;
        }
        return sum;
    }
}
