import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str_n = Integer.toString(n);//0.int to String
        for (int i = 0; i < str_n.length(); i++)
            answer += Integer.parseInt(String.valueOf(str_n.charAt(i))); //1.String to int
        return answer;
    }
}

---------------------------------------------------------------------------
다른사람 풀이 보고 다시

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}


->뒤에서부터 더해도 똑같다는 생각!
->형변환 필요 없음!
