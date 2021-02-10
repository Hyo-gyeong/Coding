import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<Integer>();
        while(n > 0){
            list.add((int)(n%10)); //(int)n%10은 안됨
            n /= 10;
        }
        int[] answer = new int[list.size()];
        int i = 0;
        for (int a : list)
            answer[i++] = a;
        return answer;
    }
}

------------------------------------------------------
memo)
계산된 전체값을 int형으로 바꿔줘야해서
------------------------------------------------------
다른 풀이
class Solution {
  public int[] solution(long n) {
      String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            cnt++;
        }
      return answer;
  }
}

근데 시간이 훨씬 오래 걸림
