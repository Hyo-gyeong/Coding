import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int saved = 0;
        List<Integer> l_temp = new ArrayList<>(); 
        List<Integer> l_temp2 = new ArrayList<>();
        for (int i = 0; i < lost.length; i++){
            l_temp.add(lost[i]);
            l_temp2.add(lost[i]);
        }
        List<Integer> r_temp = new ArrayList<>();
        for (int i = 0; i < reserve.length; i++)
            r_temp.add(reserve[i]);
        
        l_temp.removeAll(r_temp); //1.공통값 제거
        r_temp.removeAll(l_temp2);
        
        for (int i = 0; i < l_temp.size(); i++)
            for (int j = 0; j < r_temp.size(); j++){
                if (l_temp.get(i) == r_temp.get(j)+1 ||
                    l_temp.get(i) == r_temp.get(j)-1){
                    r_temp.set(j, -10);
                    l_temp.set(i, -10);
                    saved++;
                }
            }
        return n-l_temp.size()+saved;
    }
}

------------------------------------------------------------------------
memo)
r_temp.set(j, -10)이렇게 조잡하게 풀었지만 7번 테스트 케이스를 일주일동안 찾아헤맨 나로서는 최선이었다....

1. 공통값 제거
removeAll : ArrayList의 removeAll() 메소드는 인자로 전달된 Collection의 아이템들과 일치하는 객체를 리스트에서 삭제함.
2. 값 추가
addAll : ArrayList의 addAll() 메소드는 인자로 전달되는 Collection 객체의 모든 아이템을 리스트에 추가함.
2-1. 시작위치 지정 가능
ArrayList.addAll(int index, Collection c) : 리스트의 몇번째 인덱스부터 아이템을 추가할 수 있는지 정할 수 있음.
