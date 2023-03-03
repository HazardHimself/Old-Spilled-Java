public class Solution {
    public static int solution(int n) {
    int out;
    int[][] DP = new int[n+1][n+1];
    for (int i = n; i >= 0; i--) {
        DP[i][0] = 1;
        for (int x = i + 1; x <= n; x++) {
            DP[i][x] = DP[i+1][x-i-1] + DP[i+1][x];
        }
    }
    out = (DP[0][n] - 1);
    return out;
    }
}
