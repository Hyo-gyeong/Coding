import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<Integer>();
        int k = 0;
        int i = 0;
        int j;
        while(i < numbers.length){
            j = 0;
            while(j < numbers.length){
                if (i != j){
                    int sum = numbers[i]+numbers[j];
                    if (answer.contains(sum) == false) //1.리스트의 내의 contains사용
                        answer.add(sum);
                }
                j++;
            }
            i++;
        }
        Collections.sort(answer);
        int[] array = new int[answer.size()];

        int size=0;

        for(int temp : answer){
            array[size++] = temp;
        }
        return array;
    }
}

**************************************************************************************************************************
memo)
1.List 인터페이스 : ArrayList, LinkedList등의 종류가 있음.
메소드..
add : 동적으로 추가
get : 특정 인덱스의 값을 추출
size : 개수를 리턴
contains : 항목값을보고 true, false 반환
remove :
 -remove(값)
 -remove(인덱스)
 
출처 : https://wikidocs.net/207
**************************************************************************************************************************

더 나은 예시풀이)
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public static ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(); //1.set 이용

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        Iterator<Integer> iter = set.iterator(); //2.iterator사용
        while(iter.hasNext()) {
            answer.add(iter.next());
        }

        Collections.sort(answer); //3.collections사용
        return answer;
    }
}

**************************************************************************************************************************
memo)
1.set을 이용하면 값을 중복해서 저장할 수 없기때문에 (if문보다 set을 이용하는것이 더 좋을 듯)
Set 컬렉션을 구현하는 대표적인 클래스들은 HashSet, TreeSet, LinkedHashSet 등이 있음
형식 : Set<E> 객체명 = new 클래스<E>();
Set 컬렉션을 구현하는 클래스들이 공통적으로 사용하는 주요 메소드는 add, iterator, size, remove, clear 등이 있음
-HashSet
 HashSet은 Set 컬렉션을 구현하는 대표적인 클래스이다. 데이터를 중복 저장할 수 없고 순서를 보장하지 않는다.
-TreeSet
 TreeSet도 HashSet과 같이 중복된 데이터를 저장할 수 없고 입력한 순서대로 값을 저장하지 않는다. 차이점은 TreeSet은 기본적으로 '오름차순'으로 데이터를 정렬한다.
-LinkedHashSet
 LinkedHashSet도 중복된 데이터를 저장할 수 없다. 차이점은 '입력된 순서'대로 데이터를 관리한다.

2.Iterator는 자바의 컬렉션 프레임웍에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화 하였는데 그 중 하나가 Iterator이다.
Iterator는 인터페이스인데 그 메소드는 다음과 같다.
public interface Iterator {
  boolean hasNext(); //true, false 반환
  Object next(); //true, false 반환
  void remove(); //next()로 읽어 온 요소를 삭제
}
단, Iterator 는 자동으로 Index 를 관리해주기 때문에, 사용에 편리함이 있을수 있으나 Iterator 를 열어보면 객체를 만들어 사용하기 때문에 느릴수 밖에 없다.
따라서 하나씩 가져올 때에는 
for( Iterator<Integer> itr = list.iterator(); itr.hasNext(); ){
 list.get( itr.next() );
}
보다는
int size = list.size();
for( int i = 0; i < size; i++ ){
 list.get( i );
}
이 시간 효율이 더 좋다.

3.Collections Class 
모두 static 메소드로 구성됨
컬렉션 타입의 객체에 대한 객체생성, 정렬, 병합, 검색 등의 알고리즘을 구현
메소드...
max() / min() 
sort() : 오름차순
shuffle() : 랜덤섞기
binarySearch() : indexOf() 메소드와 동일, 인덱스 0 → 끝 순서로 값을 검색해서 최초 검색된 값의 인덱스를 반환, 지정된 컬렉션의 값 찾아줌
disjoint() : 두 개의 컬렉션을 비교해서 일치하는 값이 하나도 없으면 true, 하나라도 있으면 false 반환
copy() : 지정된 컬렉션의 모든 요소를 새로운 컬렉션으로 복사해서 반환
copy(dest, source)로 인자 전달, dest.size()가 source.size()보다 작으면 에러, 특이한점은 전체 배열의 크기가 아닌 size()를 기준으로 에러 여부가 발생, 기존 dest 배열의 앞쪽에 삽입
reverse() : 순서를 역으로 변경

출처: [https://vaert.tistory.com/108 [Vaert Street]]
[https://m.blog.naver.com/heartflow89/220994601249]
[https://codevang.tistory.com/139]
**************************************************************************************************************************
