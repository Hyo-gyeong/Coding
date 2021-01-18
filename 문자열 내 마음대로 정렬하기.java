import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<String>();
        int len = strings.length;
        String[] word = new String[len];
        
        for (int i = 0; i < len; i++){
            word[i] = strings[i].charAt(n) + strings[i]; //1.문자추출, 문자 붙이기
            list.add(word[i]);
        }
        
        Collections.sort(list); //2.Arrays.sort()차이
        Iterator<String> it = list.iterator(); //iterator사용해야 hasNext()사용 가능
        String[] answer = new String[list.size()];
        int index = 0;
        while(it.hasNext()) { 
            String str = it.next();
            str = str.substring(1, str.length()); //1.문자추출
            answer[index++] = str;
        }
        
        //3.Iterator vs for문
        //len = list.size();
        //String[] answer = new String[len];
        //for (int i = 0; i < len; i++)
            //answer[i] = list.get(i).substring(1, list.get(i).length());
        
        return answer;
    }
}

****************************************************************************
memo)
1-1.문자추출
  1)charAt(index) : 인수번째 문자를 읽음.
    ex)
    String a = "abcd";
    System.out.println(a.charAt(1)); //b
  2)indexOf(문자) : 해당 문자의 위치(=index)를 반환. 없으면 -1반환
    ex)
    "abcde".indexOf("e"); //4
    *lastIndexOf()는 뒤에서부터 셈
  3)substring(인수, 인수) : 문자'열'을 읽어냄. 첫번째 인수는 시작점(포함됨), 두번째 인수는 끝지점(포함 안됨).
    ex)
    String a = "abcde";
    System.out.println(a.substring(1, 3)); //bc
    *마지막까지 포함하고싶으면 a.length()사용하면 됨. //문자열 길이 반환
1-2.문자 붙이기
  1)+연산자 사용 : 문자열을 먼저 StringBuilder로 변환시킨뒤, Append로 문자열을 더하고 다시 toString함수로 문자열로 반환해줌.
                  가장 일반적으로 많이 사용.
                  StringBuilder를 사용하면 초기화 필요없음.
                  null로 초기화되면 "null"을 출력.
  2)append() : +와 같음.
    ex)
    StringBuilder sb = new StringBuilder("첫번째 ");
    sb.append("두번째 ");
    sb.append("세번째");

    System.out.println(sb);
    //첫번째 두번째 세번째
      ex)null 초기화
      String a = null;
      String b = a + "hi";
      System.out.println(b); 
      //nullhi;
      *이유 : StringBuilder가 상속받은 클래스 AbstractStringBuilder가 null일 때 null을 값으로 하나씩 붙여주기 때문에.
  3)concat() : 합친 문자열을 String으로 생성(new String())해준다. 
               따라서 문자열을 계속해서 붙인다고 가정하면, 문자열을 붙일 때마다 주소값을 할당하게됨.
               그렇기 때문에 여러개가 아닌 두 개의 문자열을 더할 때 concat을 사용하는것이 좋음. 
               concat할 값을 초기화해줘야함.
    ex)
    String text1 = "Hello"; 
    String text2 = "World!"; 
    String rslt = ""; //초기화 필수
    String rslt1 = rslt.concat(text1); //예로,,주소값 2000
    String rslt2 = rslt1.concat(" "); //주소값 3000
    String rslt3 = rslt2.concat(text2); //주소값 4000으로 다 다르게 생성됨.
    System.out.println(rslt3); //Hello World!
      **초기값이 null일때 오류
      String strSample1 = null; 
      String result = strSample1.concat("Hi"); 
      System.out.println(result); 
      // 결과 java.lang.NullPointerException
   
2.Arrays.sort() vs Collections.sort()
전자는 int[]이나 Stringp[]같은 배열에 사용되고, 후자는 List에 사용됨.

3.Iterator vs for문
List는 대표적으로 ArrayList와 LinkedList 2가지의 구현체가 있다. 
이때, ArrayList같은경우는 내부에서 배열을 이용해 데이터를 관리한다. 
그래서 인덱스로 데이터를 가져올때 속도가 매우 빠르다.
따라서 굳이 Iterator를 사용할 필요고, for문을 사용해도 효율성에 문제가 없다. 
하지만 LinkedList의 경우 물리적으로 연결되어있는게 아니라 논리적으로 연결되어있으며, 특정 인덱스의 값을 가져오기 위해서 인덱스 0부터 순서대로 찾는다.
그래서 LinkedList의 경우 for문을 사용하면 시간복잡도는 O(n)이 아니라 O(n^2)가 된다.
그러므로 Iterator를 사용하는것이 좋다. Iterator는 이런 구현체에 상관없이 공통된 순회 인터페이스를 제공하기위해 존재하며 LinkedList를 순회할때도 내부 커서를 이용해 접근하기때문이다.
또는 for-each문을 사용해도 좋다. 단점은 index를 쓸 수 없다는 것.. 이를 보안하려면 index로 사용할 변수를 만들어 for-each문에 곁들일 수도 있다.

출처: https://devdy.tistory.com/9 [여행하는 기분], http://multifrontgarden.tistory.com/130
****************************************************************************


다른사람 풀이)
import java.util.*;

class Solution {
  public String[] solution(String[] strings, int n) {
      Arrays.sort(strings, new Comparator<String>(){ //1.Comparator사용
          @Override
          public int compare(String s1, String s2){
              if(s1.charAt(n) > s2.charAt(n)) return 1;
              else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
              else if(s1.charAt(n) < s2.charAt(n)) return -1;
              else return 0;
          }
      });
      return strings;
  }
}

****************************************************************************
****************************************************************************
