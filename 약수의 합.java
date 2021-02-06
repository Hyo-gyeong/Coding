import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> divisor = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++){ //제곱근 반환. !약수의 중앙값은 제곱근을 넘지 않음.
            if (divisor.contains(i) == false && n%i == 0){
                answer += i;
                divisor.add(i);
                if (i != n/i){
                    answer += n/i;
                    divisor.add(n/i);
                }                
            }
        }
        return answer;
    }
}
