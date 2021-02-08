import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str_n = Integer.toString(n);
        for (int i = 0; i < str_n.length(); i++)
            answer += Integer.parseInt(String.valueOf(str_n.charAt(i)));
        return answer;
    }
}
