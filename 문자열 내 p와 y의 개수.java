class Solution {
  boolean solution(String s) {
      int countP = 0;
      int countY = 0;
      s =  s.toUpperCase(); 
      for (int i = 0; i < s.length(); i++){
          if (s.charAt(i) == 'Y')
              countY++;
          if (s.charAt(i) == 'P')
              countP++;
      }
      return countY == countP;
  }
}


다른사람 예시 풀이)
class Solution {
  boolean solution(String s) {
      s = s.toUpperCase();
      return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count(); //람다식
  }
}

------------------------------------------------------------------------
memo)
람다식(Lambda expression)은 간단히 말해서 메서드를 하나의 '식(expression)'으로 표현한 것이다. 
메서드를 람다식으로 표현하면 메서드의 이름과 반환값이 없어지므로, 람다식을 '익명 함수(anonymous function)'이라고도 한다.
메서드는 클래스에 포함되어야 하므로 클래스를 새로 만들어야 하고, 객체도 생성해야만 비로소 필요한 메서드를 호출 할 수 있다. 
  ex)
  int method(int i) {
    return (int)(Math.random() * 5) + 1;
  }
그러나 람다식은 이 모든 과정없이 오직 람다식 자체만으로도 이 메서드의 역할을 대신할 수 있다.
  ex)
  int[] arr = new int[5];
  Arrays.setAll(arr, i -> (int)Math.random() * 5) + 1;
게다가 람다식은 메서드의 매개변수로 전달되어지는 것이 가능하고, 메서드의 결과로 반환 될 수도 있다.
  .
  .
  .
람다관련 개념 https://juyoung-1008.tistory.com/48
Stream관련 개념 https://futurecreator.github.io/2018/08/26/java-8-streams/
