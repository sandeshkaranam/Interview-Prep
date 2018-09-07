import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args){
        int A[] = { 1, 1, 1, 2};
        int DP[] = new int[A.length];
        Arrays.fill(DP, -1);
        System.out.println("Max robbery amount" + cal(A.length , A, DP) );
    }

    private static int cal( int len, int A[], int DP[]){
        if(len <= 0) {
            return 0;
        }
        if(DP[len-1]!= -1) return DP[len-1];
        DP[len-1] = Math.max(A[len-1]+ cal(len -2, A, DP), cal(len -1, A, DP));

        return DP[len-1];
    }
}
