import java.util.Scanner;

public class maximumPopulationYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int instances = sc.nextInt();
        int[][] logs = new int[instances][2];
        for(int i=0;i<instances;i++){
            for(int j=0;j<2;j++){
                logs[i][j] = sc.nextInt();
            }
        }
        System.out.println(maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int startYear = startYearFinder(logs);
        int[] popCount = new int[endYearFinder(logs) - startYear];
        for(int[] period: logs){
            for(int i=period[0]; i<period[1];i++){
                popCount[i-startYear]++;
            }
        }
        int maxPop = 0;
        for(int population: popCount){
            maxPop = Math.max(maxPop, population);
        }
        for(int i=0;i<popCount.length;i++){
            if (popCount[i] == maxPop){
                return i+startYear;
            }
        }
        return 0;
    }
    static int startYearFinder(int[][] logs){
        int minStart = 3000;
        for(int[] years: logs){
            minStart = Math.min(minStart, years[0]);
        }
        return minStart;
    }
    static int endYearFinder(int[][] logs){
        int maxEnd = 0;
        for(int[] years: logs){
            maxEnd = Math.max(maxEnd, years[1]);
        }
        return maxEnd;
    }
}