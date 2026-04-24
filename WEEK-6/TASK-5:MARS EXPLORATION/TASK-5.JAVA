import java.io.*;

class Result {
    public static int marsExploration(String s) {
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i % 3 == 0 || i % 3 == 2) {
                if (s.charAt(i) != 'S') count++;
            } else {
                if (s.charAt(i) != 'O') count++;
            }
        }
        
        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String s = bufferedReader.readLine();
        
        int result = Result.marsExploration(s);
        
        System.out.println(result);
        
        bufferedReader.close();
    }
}
