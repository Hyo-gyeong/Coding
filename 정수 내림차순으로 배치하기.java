import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Long> list = new ArrayList<Long>();
        while(n > 0){
            list.add(n%10);
            n /= 10;
        }
        Collections.sort(list, Collections.reverseOrder()); //1.
        for(long a : list){
            answer *= 10;
            answer += a;
        }
        return answer;
    }
}

-------------------------------------------------------------------
memo)
1.Collections.reverse()는 내림차순 정렬이 아니라 말그대로 왼쪽<->오른쪽으로 뒤집는 메소드이다.
따라서 내림차순 정렬은 위와같이 해야함.
참고 : https://www.geeksforgeeks.org/collections-reverse-java-examples/
-------------------------------------------------------------------

문제 수정되기전 메소드 구경용
public class ReverseInt {
    String res = "";
    public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
