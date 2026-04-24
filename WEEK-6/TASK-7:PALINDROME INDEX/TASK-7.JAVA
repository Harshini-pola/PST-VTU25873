import java.io.*;
import java.util.*;

class Result {

    public static int palindromeIndex(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                // Check by removing left or right
                if (isPalindrome(s, left + 1, right)) {
                    return left;
                } else if (isPalindrome(s, left, right - 1)) {
                    return right;
                } else {
                    return -1;
                }
            }
        }
        
        return -1; // already palindrome
    }

    private static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int q = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < q; i++) {
            String s = br.readLine();
            System.out.println(Result.palindromeIndex(s));
        }
        
        br.close();
    }
}
