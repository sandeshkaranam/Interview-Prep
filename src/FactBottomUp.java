public class FactBottomUp{
    public static void main(String args[]){
        int n = 10;
        // Bottom up approach
        int dp[] = new int[11];
        // Base condition
        dp[0] = 1;
        for(int i=1;i<=10;i++){
            dp[i] = dp[i-1] * i ;
        }
        System.out.println("Fact of " + n + " is " + dp[10]);
    }
}