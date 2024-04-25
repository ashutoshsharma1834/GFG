class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        if (n < 3 || m < 3)
            return -1;
        int sum = 0, ans = -1;
        for (int i = 2; i < n; i++) {

            for (int j = 1; j < m - 1; j++) {
                sum = mat[i - 2][j - 1] + mat[i - 2][j] + mat[i - 2][j + 1] + mat[i - 1][j] + mat[i][j - 1] + mat[i][j]
                        + mat[i][j + 1];
                if (sum > ans) {
                    ans = sum;
                    sum = 0;
                }
            }
        }
        return ans;
    }
};