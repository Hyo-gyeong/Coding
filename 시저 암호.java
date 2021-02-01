class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++){
            int to_int = (int)s.charAt(i);
            if(to_int == ' ') {
                answer += (char)to_int;
                continue;
            }
            int new_int = to_int+n;
            if (to_int <= (int)'z' && new_int > (int)'z' ||
               to_int <= (int)'Z' && new_int > (int)'Z')
                new_int -= 26;
            answer += (char)new_int;
        }
        System.out.println(answer);
        return answer;
    }
}
