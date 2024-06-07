class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int[] freq = new int[maxx + 2];
        for (int i = 0; i < n; i++) {
            freq[l[i]]++;
            freq[r[i] + 1]--;
        }
        int sum = 0, ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < maxx + 2; i++) {
            sum += freq[i];
            if (max < sum) {
                max = sum;
                ans = i;
            }
        }
        return ans;
    }
}