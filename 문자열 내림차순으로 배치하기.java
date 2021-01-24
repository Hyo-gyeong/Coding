import java.util.*;
class Solution {
    public String solution(String s) {
        String[] tmp = new String[s.length()];
        for (int i = 0; i < s.length(); i++)
            tmp[i] = Character.toString(s.charAt(i));
        Arrays.sort(tmp, Collections.reverseOrder());
        String answer = "";
        for (int i = 0; i < s.length(); i++)
            answer += tmp[i];
        System.out.println(answer);
        return answer;
    }
}

다른사람 풀이 예1)
import java.util.*;
class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuffer st = new StringBuffer(String.valueOf(ch));
        st.reverse();
        return st.toString();
    }
}

다른사람 풀이 예2)
import java.util.*;
class Solution {
    public String solution(String s) {
        char[] sol = s.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
