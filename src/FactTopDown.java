import java.util.Arrays;

public class FactTopDown {

    public static void main(String[] args){
        int DP[] = new int[11];
        Arrays.fill(DP, -1);
        DP[0] = 1;
        System.out.println("Fact of 10 is " + cal(10, DP));
    }

    private static int cal(int n, int DP[]){
        //Base condition
        if(DP[n]!= -1) return DP[n];
        // Top Down approach
        DP[n] = n * cal(n-1, DP);
        return DP[n];
    }
}
