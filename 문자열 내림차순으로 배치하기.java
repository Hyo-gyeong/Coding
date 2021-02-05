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
        Arrays.sort(ch);//2.이걸 사용하려고 1번과 같이 처리
        StringBuffer st = new StringBuffer(String.valueOf(ch));//3.valueOf() method
                                                              //4.StringBuffer
        st.reverse();
        return st.toString();
    }
}
------------------------------------------------------------------------
memo)
1.String into array of chars
2.public static void sort(int[] arr, int from_Index, int to_Index)
  arr - the array to be sorted
  from_Index - the index of the first element, inclusive, to be sorted
  to_Index - the index of the last element, exclusive, to be sorted
  This method doesn't return any value.
3.valueOf(char[] data) − Returns the string representation of the char array argument.
4.StrigBuffer
  StringBuffer 클래스는 자바 프로그램 내에서 변하는 문자열을 다룰 때 사용한다.
  String 클래스의 객체는 한 번 생성되면 그 내용이 변하지 않는 반면에, StringBuffer 클래스의 객체는 한 번 생성된 후에도 계속하여 저장하고 있는 문자열의 내용을 변경할 수 있다.
  -생성자중...
  StringBuffer(String str)
  str의 초기 문자열을 가지고 16개의 문자를 저장할 수 있는 버퍼를 가진 객체를 생성한다.
  -메소드
  append
  insert
  substring등이 있다.
  위의 코드에서 사용된 메소드 StringBuffer reverse() : 문자열의 역순으로 된 문자열을 반환한다.

출처: https://hyeonstorage.tistory.com/179 [개발이 하고 싶어요]
+ String, StringBuilder, StringBuffer의 차이 -> https://novemberde.github.io/2017/04/15/String_0.html
------------------------------------------------------------------------

다른사람 풀이 예2)
import java.util.*;
class Solution {
    public String solution(String s) {
        char[] sol = s.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString(); //위의 메소드들을 한 번에
    }
}
