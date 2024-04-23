import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    @SuppressWarnings("static-access")
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.firstElement(n));
        }
    }
}

class Solution {
    static int firstElement(int n) {
        // code here
        if (n == 1 || n == 2)
            return 1;
        int a = 1, b = 1, ans = 0, mod = 1000000007;
        for (int i = 3; i <= n; i++) {
            ans = (a + b) % mod;
            a = b;
            b = ans;
        }
        return ans;

    }
}