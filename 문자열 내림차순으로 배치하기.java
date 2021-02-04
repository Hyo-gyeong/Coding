import java.util.*;
class Solution {
    public String solution(String s) {
        String[] tmp = new String[s.length()];
        for (int i = 0; i < s.length(); i++)
            tmp[i] = Character.toString(s.charAt(i));
        Arrays.sort(tmp, Collections.reverseOrder()); //array내림차순 정렬
        String answer = "";
        for (int i = 0; i < s.length(); i++)
            answer += tmp[i];
        System.out.println(answer);
        return answer;
    }
}

------------------------------------------------------------------------
memo)
sort()내부에 정렬할 배열과 내림차순 여부 쓸 수 있음.
참고 https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
------------------------------------------------------------------------

다른사람 풀이 예1)
import java.util.*;
class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();//1.
        Arrays.sort(ch);
        StringBuffer st = new StringBuffer(String.valueOf(ch));
        st.reverse();
        return st.toString();
    }
}
------------------------------------------------------------------------
memo)
1.String into array of chars
------------------------------------------------------------------------

다른사람 풀이 예2)
import java.util.*;
class Solution {
    public String solution(String s) {
        char[] sol = s.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
