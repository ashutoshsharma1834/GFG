class Solution {
    static String armstrongNumber(int n) {
        int temp = 0, ans = 0, num = n;
        while (n != 0) {
            temp = n % 10;
            ans += temp * temp * temp;
            n = n / 10;
        }
        if (ans == num) {
            return "true";
        }
        return "false";
    }
}