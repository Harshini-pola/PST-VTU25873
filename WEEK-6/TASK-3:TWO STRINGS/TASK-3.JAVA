import java.util.*;

public class Solution {
    public static String twoStrings(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        
        // Store characters of first string
        for (char c : s1.toCharArray()) {
            set.add(c);
        }
        
        // Check if any character of second string exists in set
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine(); // consume newline
        
        for (int i = 0; i < t; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            
            System.out.println(twoStrings(s1, s2));
        }
        
        sc.close();
    }
}A
