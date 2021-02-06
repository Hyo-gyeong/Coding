class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        int toUpper = 1;
        for (int i = 0; i < s.length(); i++){
            String tmp = Character.toString(s.charAt(i));
            if (tmp.equals(" ")){ //1.== vs equals
                toUpper = 1;
                answer += " ";
                continue;
            }
            if (toUpper == 1)
                answer += tmp.toUpperCase();
            else
                answer += tmp;
            toUpper = (toUpper + 1) % 2;
            
        }
        return answer;
    }
}

------------------------------------------------------------------
memo)
1.call by value, call by reference를 공부하면 알 수 있다.
CBV는 주소값을 할당받지 않는 primitive type에 해당된다.
CBR은 객체를 부를 때 주소를 부르게되고 Class, Object가 여기에 해당한다.
참고 : https://ojava.tistory.com/15#
------------------------------------------------------------------

다른 풀이 예시)
class Solution {
  public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split(""); //알파벳,공백 하나하나 넣기

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1; //공백에서 0이됨
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); //공백다음문자 = 홀수문은 무조건 cnt = 1에서 시작
        }
      return answer;
  }
}
