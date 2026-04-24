import java.io.*;
import java.util.*;

public class Solution {

    static int longestPalindrome(String s, int start, int n) {
        int maxLen = 1;

        for (int center = start; center < start + n; center++) {

            int l = center, r = center;
            while (l >= start && r < start + n && s.charAt(l) == s.charAt(r)) {
                maxLen = Math.max(maxLen, r - l + 1);
                l--;
                r++;
            }

            l = center;
            r = center + 1;
            while (l >= start && r < start + n && s.charAt(l) == s.charAt(r)) {
                maxLen = Math.max(maxLen, r - l + 1);
                l--;
                r++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        String doubled = s + s;

        for (int i = 0; i < n; i++) {
            System.out.println(longestPalindrome(doubled, i, n));
        }
    }
}
