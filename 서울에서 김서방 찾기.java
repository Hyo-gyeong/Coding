class Solution {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++)
            if (seoul[i].equals("Kim"))
                return "김서방은 "+i+"에 있다";
        return "";
    }
}

-----------------------------------------------------------

다른사람 풀이 예)
import java.util.Arrays;
class Solution {
    public String solution(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim"); //1.Arrays.asList
        return "김서방은 "+ x + "에 있다";
    }
}

-----------------------------------------------------------
memo)
1.일반 배열을 ArrayList로 변환한다.
-List<String> list = Arrays.asList(변환하고자 하는 배열이름);
-Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴한다.
-java.util.ArrayList 클래스와는 다른 클래스이다.
-java.util.Arrays.ArrayList 클래스는 set(), get(), contains() 메서드를 가지고 있지만 원소를 추가하는 메서드는 가지고 있지 않기 때문에 사이즈를 바꿀 수 없다.
  ->asList()를 사용해서 List 객체를 만들 때 새로운 배열 객체를 만드는 것이 아니라, 원본 배열의 주소값을 가져오게 된다.
    따라서 asList()를 사용해서 내용을 수정하면 원본 배열도 함께 바뀌게 되고 원본 배열을 수정하면 그 배열로 만들어뒀던 asList()를 이용한 List 내용도 바뀌게 된다.
    이러한 이유 때문에 Arrays.asList()로 만든 List에 새로운 원소를 추가하거나 삭제 할 수 없다.
-배열의 내용을 수정하려고 할 때 List로 바꿔서 편리하게 사용하기 위함.
-Arrays.indexOf(Object o)의 indexOf()사용가능(?)
-indexOf(Object o)는 해당 객체의 값이 없으면 -1을 반환한다.

2.배열을 ArrayList로 변환해서 복사
-List<String> list = new ArrayList<String>(Arrays.asList(변환하고자 하는 배열이름));
-원본과는 별개의 주소값을 가짐.

출처 : https://m.blog.naver.com/roropoly1/221140156345
