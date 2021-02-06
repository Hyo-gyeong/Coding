class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') { //공백처리
                answer += s.charAt(i);
                continue;
            }
            int to_int = (int)s.charAt(i); //1.ascii
            int new_int = to_int+n;
            if (to_int <= (int)'z' && new_int > (int)'z' ||
               to_int <= (int)'Z' && new_int > (int)'Z')
                new_int -= 26;
            answer += (char)new_int;
        }
        return answer;
    }
}

--------------------------------------------------------------------
memo)
1.(int)char형 = 문자를 ascii값으로, (char)int형 = ascii값을 해당 문자로
--------------------------------------------------------------------
